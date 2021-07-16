/* Questao 19.14: Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina
e escreva a média aritmética simples dos elementos ímpares armazenados neste vetor. */
package Exercer03;

import java.util.Scanner;

public class Vetor014 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i=0; i<vetorA.length; i++) {
            System.out.println("Entre co o valor do vetorA da posiçao: " + i);
            vetorA[i] = scan.nextInt();
        }
        int qtdImpares = 0;
        int total = 0;
        for (int i=0; i<vetorA.length; i++) {
            if (vetorA[i] % 2 != 0) {
                total += vetorA[i];
                qtdImpares++;
            }
            }
        System.out.println("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i] + " ");

            }
        System.out.println();

        System.out.println("Soma: "+total);
            System.out.println("Qtd numeros Impares: " + qtdImpares);
            System.out.println("Qtd media dos numeros Impares: " + (total/qtdImpares));

        }
    }





