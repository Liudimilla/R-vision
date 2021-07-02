/*Questao 19.5 ;Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho , sendo que cada elemento do vetor B devera ser o raiz quadrado do respectivo
elemento de A mutiplicaçao por sua posiçao B[i]= A[i]*i.
 */
package Exercer03;

import java.util.Scanner;

public class Vetor5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for (int i=0; i<vetorA.length; i++) {
            System.out.println("Entre com o valor da posiçao: " + i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i] * i;
        }
        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++) {
            System.out.println(vetorA[i] + "");
        }
        System.out.println();




        }
    }


