/*1 - (Loiane - Adaptado) Faça um programa para armazenar em uma matriz os compromissos de uma agenda pessoal, onde, cada dia do mês deve conter 24 horas, e, para cada uma destas 24 horas podemos associar uma tarefa específica (compromisso agendado). 
O programa deve ter um menu onde o usuário indica o dia do mês que deseja alterar e a hora, entrando em seguida com o compromisso, ou então, o usuário pode também consultar a agenda, fornecendo o dia e a hora para obter o compromisso armazenado.*/
package com.mycompany.psc.exercicio07;

import java.util.Scanner;

public class Questao01 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String[][] agenda = new String[24][30];
        int hora, dia;

        while (true) {
            
            System.out.print("\nAGENDA\n\n1- AGENDAR\n2 - CONSULTAR\n0 - SAIR\nINFORME: ");
            int opcao = ler.nextInt();
            
            while (opcao != 1 && opcao != 2 && opcao != 3){
                
                System.out.println("INFORME UM VALOR VÁLIDO\n");
                System.out.print("INFORME:");
                opcao = ler.nextInt();
                
            }

            if (opcao == 1) {

                System.out.println("\nAGENDAR");
                System.out.print("QUAL DIA: ");
                dia = ler.nextInt();
                System.out.print("QUAL HORA: ");
                hora = ler.nextInt();
                ler.nextLine();
                System.out.print("\nDIGITE O COMPROMISSO: ");
                agenda[hora][dia] = ler.nextLine();
                System.out.println("\nCOMPROMISSO AGENDADO");
              

            } else if (opcao == 2) {

                System.out.println("\nCONSULTA");
                System.out.print("QUAL DIA: ");
                dia = ler.nextInt();
                System.out.print("QUAL HORA: ");
                hora = ler.nextInt();
                System.out.println("\n" + agenda[hora][dia] + "\n");
                System.out.println("COMPROMISSOS DO DIA: ");
                
                for(int i = 0; i < 24; i++){
                    
                    System.out.println((i + 1) + "h " + agenda[i][dia]);
                    
                }

            }else if (opcao == 0){
                
                break;
                
            }
        }

    }
}
