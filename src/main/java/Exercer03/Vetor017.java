/* Questao 19.17; Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo
de pessoas. Escreva um programa que determine e escreva a quantidade de pessoas que possuem idade
superior a 35 anos.
 */
package Exercer03;

import java.util.Scanner;

public class Vetor017 {
    public static void main(String[] args) {
        Scanner milla = new Scanner(System.in);

        int[] vetorA = new int[10];
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com a idade " + (i + 1));
            vetorA[i] = milla.nextInt();
        }

        int qtdMaior = 0;
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] > 35) {
                qtdMaior++;
            }

        }

        System.out.print("Vetor de idade = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i] + " ");

        }
        System.out.println();

        System.out.println("Quantidade pessoas idade >35: " +qtdMaior);

    }

}
