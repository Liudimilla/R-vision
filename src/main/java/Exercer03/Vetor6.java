/*Questao 19.6;Criar um vetor B com 10 elementos inteiros. Construir um vetor C ,onde
 cada elemento do vetor C e soma dos respcetivo
elemento em A e B , ou seja C[i]= A[i]+B[i].
*/
package Exercer03;

import java.util.Scanner;

public class Vetor6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor do VetorA da posiçao" + i);
            vetorA[i] = scan.nextInt();
        }
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Entre com o valor do VetorB da posiçao" + i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i] * 2;
        }
        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i] + "");
        }
        System.out.println();

        System.out.print("Vetor B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println(vetorB[i] + "");
        }
        System.out.println();

    System.out.print("Vetor C = ");
    for(int i = 0;i<vetorC.length;i++) {
        System.out.println(vetorC[i] + "");
    }
    System.out.println();
}
}