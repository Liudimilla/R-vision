/*34.Criar um vetor A com 10 elementos inteiros. Escreva um programa que imprima cada
elemento do vetor A e a relação de todos os pares de 0 até o respectivo elemento.  */
package Exercer03;

import java.util.Scanner;

public class Vetor034 {
    public static void main(String[] args) {
        Scanner milla = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i=0; i<vetorA.length; i++) {
            System.out.println("posiçao A");
            vetorA[i] = milla.nextInt();
        }

        for (int i=0; i<vetorA.length; i++) {
            System.out.println("Analizando o numero "+vetorA[i]);

            for (int j=2; j<vetorA[i]; j++) {
                if (j%2 == 0) {
                    System.out.println(j+" e par");
                }
            }
            System.out.println();
            }
        }
}
