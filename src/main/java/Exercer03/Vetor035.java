/*35.Criar um vetor A com 10 elementos inteiros. Escreva um programa que imprima cada
 elemento do vetor A e a relação de todos os divisores do respectivo elemento.
 */
package Exercer03;

import java.util.Scanner;

public class Vetor035 {
    public static void main(String[] args) {
            Scanner milla = new Scanner(System.in);
            int[] vetorA = new int[10];
            for (int i = 0; i < vetorA.length; i++) {
                System.out.println("Entre com o valor da posiçao A - " + i);
                vetorA[i] = milla.nextInt();
            }

        for (int i=0; i<vetorA.length; i++) {
            System.out.println("Analizando o numero "+vetorA[i]);

            for (int j=1; j<vetorA[i]; j++) {
                if (vetorA[i] % j == 0) {
                    System.out.println(j+" e divisor");
                }
            }
            System.out.println();
        }
    }
}
