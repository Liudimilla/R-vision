/* 37.Criar um vetor A com 15 elementos inteiros. Construir um vetor B
 de mesmo tamanho, sendo que cada elemento do vetor B seja o fatorial do elemento correspondente
  em A. */
package Exercer03;

import java.util.Scanner;

public class Vetor037 {
    public static void main(String[] args) {
        Scanner milla = new Scanner(System.in);

        int[] vetorA = new int[15];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor da posiçao A - " + i);
            vetorA[i] = milla.nextInt();
        }
        for (int i = 0; i < vetorA.length; i++) {
}
