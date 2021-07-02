/*Questao 19.4 ;Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho , sendo que cada elemento do vetor B devera ser o raiz quadrado do respectivo
elemento de A, ou seja; B[i]= sqrt(A[i]);
 */
package Exercer03;

import java.util.Scanner;

public class Vetor4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int [15];
        double[] vetorB = new double[vetorA.length];

        for (int i=0; i<vetorA.length; i++) {
            System.out.println("Entre com o valor da posiçao: " +i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = Math.sqrt(vetorA[i]);
        }
        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++) {
            System.out.println(vetorA[i] + "");
        }
        System.out.println();

        System.out.print("Vetor B = ");
        for (int i=0; i<vetorB.length; i++) {
            System.out.println(vetorB[i] + "");
        }
        System.out.println();



    }
}
