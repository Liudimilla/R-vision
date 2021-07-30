/*Questao 19.31::..Ler um vetor A com 20 elementos. Separar os elementos pares e ímpares de A utilizando apenas um vetor extra B. Sugestão: no início do vetor B armazene os elementos pares de A e nas posições restantes do vetor B armazene os elementos de A que são ímpares..Ler um vetor A com 20 elementos. Separar os
elementos pares e ímpares de A utilizando apenas um vetor extra B. Sugestão:
 no início do vetor B armazene os elementos pares de A e nas posições restantes
 do vetor B armazene os elementos de A que são ímpares. */
package Exercer03;

import java.util.Scanner;

public class Vetor031 {
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
