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
public class exC2022 {

    public static void main(String[] args) {
        int numero;
        Scanner scan = new Scanner(System.in);
        numero = scan.nextInt();
        scan.nextLine();
        String fina = "";
        if (numero < 0) {
            return;
        } else {
            String num = Long.toString(numero);
            char[] nume = num.toCharArray();
            for (int i = nume.length-1; i >= 0; i--) {   
                if (nume[i] == '1') { fina = fina + "um "; }
                if (nume[i] == '2') { fina = fina + "dois "; }
                if (nume[i] == '3') { fina = fina + "tres "; }
                if (nume[i] == '4') { fina = fina + "quatro "; }
                if (nume[i] == '5') { fina = fina + "cinco "; }
                if (nume[i] == '6') { fina = fina + "seis "; }
                if (nume[i] == '7') { fina = fina + "sete "; }
                if (nume[i] == '8') { fina = fina + "oito "; }
                if (nume[i] == '9') { fina = fina + "nove "; }
                if (nume[i] == '0') { fina = fina + "zero "; }
                if(i!=0){ fina=fina+"- "; }
            }
            System.out.println(fina);
        }
    }
}

