/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2022_tecla;

import java.util.Scanner;

/**
 *
 * @author simao
 */
public class Resolucao2022C {
  public static void main(String[] args) {
            String[] letras = new String[]{
            "2 1", "2 2", "2 3",
            "3 1", "3 2", "3 3",
            "4 1", "4 2", "4 3",
            "5 1", "5 2", "5 3",
            "6 1", "6 2", "6 3",
            "7 1", "7 2", "7 3", "7 4",
            "8 1", "8 2", "8 3",
            "9 1", "9 2", "9 3", "9 4"
        };
        Scanner sc = new Scanner (System.in);
        String palavra = sc.nextLine();        
        String[] nova=palavra.split(" ");
        String stringfinal="";
        for(int i=0;i<nova.length;i++){
            stringfinal=stringfinal+nova[i];
        }
           stringfinal=stringfinal.toLowerCase();
     //      System.out.println(stringfinal);
        for(int i = 0; i < stringfinal.length(); i++){
            if(stringfinal.charAt(i)<'z' && stringfinal.charAt(i)>'a'){
            System.out.println(letras[stringfinal.charAt(i)-'a']);
            }
        }
  }
}