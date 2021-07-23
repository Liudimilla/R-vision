/*Questao 19.25.Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e
 tamanho, obedecendo as seguintes regras de formação: a) Bi deverá receber 1 quando Ai for par;
 b) Bi deverá receber 0 quando Ai for ímpar.
 */
package Exercer03;

import java.util.Scanner;

public class Vetor025 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for (int i=0; i<vetorA.length; i++)  {
            System.out.println("Entre com um numero para posiçao"+i);
            vetorA[i] = scan.nextInt();
// [? e IF] (e o ) [: sig ELSE]:
            vetorB[i] = (vetorA[i] % 2 == 0) ? 1 : 0;
        }
        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++) {
            System.out.print(vetorA[i]+ " ");
        }
        System.out.println();

        System.out.print("Vetor B = ");
        for (int i=0; i<vetorA.length; i++) {
            System.out.print(vetorB[i]+ " ");
        }
        System.out.println();
    }
}
