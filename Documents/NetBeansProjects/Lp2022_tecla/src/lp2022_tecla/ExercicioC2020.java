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
public class ExercicioC2020 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean confirma = true;
        int valor;
        int total = 0;
        double[] nivel = {0, 0, 0, 0, 0, 0};
        System.out.println("Digite os seus numeros: ");
        while (confirma) {
            valor = scan.nextInt();
            if (0 <= valor && valor < 30) {
                nivel[0] = nivel[0] + 1;
            } else if (30 <= valor && valor < 50) {
                nivel[1] = nivel[1] + 1;
            } else if (50 <= valor && valor < 75) {
                nivel[2] = nivel[2] + 1;
            } else if (75 <= valor && valor < 85) {
                nivel[3] = nivel[3] + 1;
            } else if (85 <= valor && valor < 95) {
                nivel[4] = nivel[4] + 1;
            } else if (95 <= valor && valor <= 100) {
                nivel[5] = nivel[5] + 1;
            }
            if (valor < 0) {
                confirma = false;
            }
            if (valor >= 0 && valor <= 100) {
                total++;
            }
        }

        for (int i = 0; i < nivel.length; i++) {
            System.out.println("Nivel " + (i + 1) + ": " + (nivel[i] * 100) / total + "%");
        }

    }
}
