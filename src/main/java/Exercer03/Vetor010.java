/*Questao 19.10; Criar um vetor A com 10 elementos inteiros. Construir um
vetor B de mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
ser o resto da divisão do respectivo elemento de A por 2 (dois), ou seja:
B[i] := A[i] % 2.
 */
package Exercer03;

import java.util.Scanner;

public class Vetor010 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

         int[] vetorA = new int[10];
         int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre co o valor do vetorA da posiçao: " + i);
            vetorA[i] = scan.nextInt();
        }
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Entre co o valor do vetorB da posiçao: " + i);
            vetorB[i] = scan.nextInt();
        }
  for (int i=0; i<vetorB.length; i++) {
      vetorB[i] = vetorA[i] % 2;
  }
        System.out.println("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();
    }
}
