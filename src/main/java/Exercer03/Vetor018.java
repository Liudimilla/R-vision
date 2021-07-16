/* Questao 19.18; Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de
pessoas. Escreva um programa que determine e escreva a menor e a maior idades e suas respectivas posições.
 */
package Exercer03;

import java.util.Scanner;

public class Vetor018 {
    public static void main(String[] args) {
        Scanner milla = new Scanner(System.in);

        int[] vetorA = new int[10];
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com a idade " + (i + 1));
            vetorA[i] = milla.nextInt();
        }
        int menor = vetorA[0];
        int indexMenor = 0;
        int maior = vetorA[0];
        int indexMaior = 0;
        for (int i = 1; i < vetorA.length; i++) {
            if (vetorA[i] > maior) {
                maior = vetorA[i];
                indexMaior = i;
            } else if (vetorA[i] < menor) {
                menor = vetorA[i];
                indexMenor = i;
            }
        }

        System.out.print("Vetor de idade = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i] + " ");

        }
        System.out.println();

        System.out.println("Menor idade: " + menor);
        System.out.println("Indice Menor idade: " + indexMenor);
        System.out.println("Menor idade: " + maior);
        System.out.println("Indice Menor idade: " + indexMaior);
    }
}
