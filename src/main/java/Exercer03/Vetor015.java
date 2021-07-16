/* Questao 19.15; Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que defina
 o percentual de elementos pares e ímpares, respectivamente, armazenados neste vetor
 */
package Exercer03;

import java.util.Scanner;

public class Vetor015 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i=0; i<vetorA.length; i++) {
            System.out.println("Entre com o valor da posiçao " +1);
            vetorA[i] = scan.nextInt();
        }
        int impar = 0;
        for (int i=0; i<vetorA.length; i++) {
            if (vetorA[i] % 2 != 0) {
               impar++;
            }
        }
        int par = vetorA.length - impar;
        //vetorA.length - 100%
        //par    - x
        //= x*vetorA.length == par * 100
        //= x == (par * 100)/vetorA.length
        double porPar = (par * 100)/vetorA.length;
        double porImpar = 100 - porPar;

        System.out.println("Vetor A = ");
        for (int i=0; i<vetorA.length; i++) {
            System.out.println(vetorA[i] + " ");

        }
        System.out.println();

        System.out.println("Porcentagem Pares: "+porPar);
        System.out.println("Porcentagem Pares: "+porImpar);


    }
}
