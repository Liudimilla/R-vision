/* Questao 19.13; Criar um vetor A com 10 elementos inteiros. Implementar um programa que determine
a soma dos elementos armazenados neste vetor que são múltiplos de 5.
 */
package Exercer03;

import java.util.Scanner;

public class Vetor013<mult> {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i<vetorA.length; i++) {
            System.out.println("Entre co o valor do vetorA da posiçao: " + i);
            vetorA[i] = scan.nextInt();
        }
        int mult = 0;
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 5 == 0) {
                mult += vetorA[i];
            }
        }
            System.out.println("Vetor A = ");
            for (int i = 0; i < vetorA.length; i++) {
                System.out.println(vetorA[i] + " ");
            }
            System.out.println();

            System.out.println("Soma: " + mult);

            }




    }


