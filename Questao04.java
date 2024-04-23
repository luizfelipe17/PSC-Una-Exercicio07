/*4 - Crie um programa que recebe uma matriz de 4x4 de números de ponto flutuante, preencha a matriz e, depois exiba:
Os valores da diagonal principal.
Os valores da diagonal secundária.
A matriz transposta.

Sugestão, utilizar orientação a objetos. A classe principal funcionará apenas como entrada e saída de dados. 
Crie um menu para cada atividade e implemente-as em classes separadas.
 */
package com.mycompany.psc.exercicio07;

import java.util.Scanner;

public class Questao04 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double[][] matriz = new double[4][4];

        for (int i = 0; i < matriz.length; i++) {
            
            System.out.println("");
            System.out.println((i + 1) + "º LINHA");

            for (int j = 0; j < matriz.length; j++) {

                System.out.print( (j + 1) + "º COLUNA - NÚMERO: ");
                matriz[i][j] = ler.nextDouble();

            }

        }
        
        System.out.println("\n\nVALORES DIAGNONAL PRINCIPAL");
        valoresDiagonalPrincipal(matriz);
        System.out.println("\nVALORES DIAGNONAL SECUNDARIA");
        valoresDiagonalSecundaria(matriz);
        System.out.print("\nMATRIZ TRANSPOSTA");
        matrizTransposta(matriz);

    }

    public static void matrizTransposta(double[][] matriz) {

        double[][] matrizTransposta = new double[4][4];
        
       for (int i = 0; i < matrizTransposta.length; i++){
           
           for (int j = 0; j < matrizTransposta.length; j++){
               
               matrizTransposta[j][i] = matriz[i][j];
               
           }
           
       }
       
       for (int i = 0; i < matrizTransposta.length; i++){
           
           System.out.println("");
           
           for (int j = 0; j < matrizTransposta.length; j++){
               
               System.out.print(matrizTransposta[i][j] + " ");
               
           }
           
       }

    }
    
    public static void valoresDiagonalPrincipal(double[][] matriz) {

       System.out.println(matriz[0][0] + " " + matriz[1][1] + " " + matriz[2][2] + " " + matriz[3][3]);

    }
    
    public static void valoresDiagonalSecundaria(double[][] matriz) {

       System.out.println(matriz[3][0] + " " + matriz[2][1] + " " + matriz[1][2] + " " + matriz[0][3]);

    }

}
