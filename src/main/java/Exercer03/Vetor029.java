/*Questao 19.29 ::29.Ler dois vetores A e B com 10 elementos cada.
Construir um vetor C, sendo este a junção dos dois outros vetores. Os primeiros
 10 elementos de C deverão receber os elementos de A e os últimos elementos C
 deverão receber os elementos de B. Desta forma, C deverá ter o dobro de elementos
 de A e B, ou seja, 20 elementos  */
package Exercer03;

import java.util.Scanner;

public class Vetor029 {
    public static void main(String[] args) {
        Scanner milla = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length*2];

        for (int i=0; i<vetorA.length; i++) {
            System.out.println("Entre com o valor da posiçao A - "+i);
            vetorA[i] = milla.nextInt();
            vetorC[i] = vetorA[i];
        }
        for (int i=0; i<vetorB.length; i++) {
            System.out.println("Entre com o valor da posiçao B - "+i);
            vetorB[i] = milla.nextInt();
            vetorC[vetorA.length+i] = vetorB[i];
        }
        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor C = ");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }
        System.out.println();
    }
        }


