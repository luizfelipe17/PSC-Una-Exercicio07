/*2 - Crie uma matriz M com dimensões 3x3, de inteiros. Em seguida, preencha a matriz e  verifique se a matriz é um quadrado mágico. 
Uma matriz é um quadrado mágico quando a soma de todas as suas linhas, todas as suas colunas, sua diagonal principal e sua diagonal secundária resultam no mesmo valor. Exemplo:*/
package com.mycompany.psc.exercicio07;

import java.util.Scanner;
import java.util.Random;

public class Questao02 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int[] somas = new int[5];

        Random aleatorio = new Random();

            
            for (int i = 0; i < matriz.length; i++) {

                for (int j = 0; j < matriz.length; j++) {

                    matriz[i][j] = ler.nextInt();
                    somas[j] += matriz[i][j];

                }

            }
            
            somas[3] = matriz[0][0] + matriz[1][1] + matriz[2][2];
            somas[4] = matriz[0][2] + matriz[1][1] + matriz[2][0];


            if (somas[0] == somas[1] && somas[0] == somas[2] 
                    && somas[0] == somas[3] && somas[0] == somas[4]
                    && somas[1] == somas[1] && somas[1] == somas[2] 
                    && somas[1] == somas[3] && somas[1] == somas[4]
                    && somas[2] == somas[1] && somas[2] == somas[2] 
                    && somas[2] == somas[3] && somas[2] == somas[4]
                    && somas[3] == somas[1] && somas[3] == somas[2] 
                    && somas[3] == somas[3] && somas[3] == somas[4]
                    && somas[4] == somas[1] && somas[4] == somas[2] 
                    && somas[4] == somas[3] && somas[4] == somas[4]) {

                System.out.print("É UM QUADRADO MÁGICO");

            } else {

                System.out.print("NÃO É UM QUADRADO MÁGICO");

            }
        
    }
}
