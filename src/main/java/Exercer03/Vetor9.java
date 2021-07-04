/*Questao 19.9;Criar dois vetor A e B com 10 elementos inteiros. Construir um vetor C ,onde
 cada elemento de C e divisao dos respcetivo elemento em A e B , ou seja C[i]= A[i]/float(B[i]).
*/
package Exercer03;

import java.util.Scanner;

public class Vetor9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre co o valor do vetorA da posiçao: " + i);
            vetorA[i] = scan.nextInt();
        }
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Entre co o valor do vetorB da posiçao: " + i);
            vetorB[i] = scan.nextInt();
        }
        for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] = vetorA[i] / vetorB[i];
        }
        System.out.println();

        System.out.println("Vetor B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();
    }
}
