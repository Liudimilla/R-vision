/*Questao 19.32.Criar um vetor A com 5 elementos inteiros.
Escreva um programa que imprima a tabuada de cada um dos elementos do vetor A.
 */
package Exercer03;

import java.util.Scanner;

public class Vetor032 {
    public static void main(String[] args) {
        Scanner milla = new Scanner(System.in);

        int[] vetorA = new int[20];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor da posiçao A - " + i);
            vetorA[i] = milla.nextInt();
        }
        int posB = 0;
        int posC = 0;

        for (int i = 0; i < vetorA.length; i++) {
            if(vetorA[i] % 2 == 0) {
                vetorB[posB] = vetorA[i];
                posB++;
            } else {
                vetorC[posC] = vetorA[i];
                posC++;
            }
        }
        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B = ");
        for (int i = 0; i < posB; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor C = ");
        for (int i = 0; i <posC; i++) {
            System.out.print(vetorC[i] + " ");
        }
        System.out.println();
    }
}
