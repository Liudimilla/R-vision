/* Questao 19.16; Criar um vetor A com 10 elementos inteiros. Escrever um programa que calcule
 e escreva:
 a) a soma de elementos armazenados neste vetor que são inferiores a 15;
 b) a quantidade de elementos armazenados no vetor que são iguais a 15; e
 c) a média dos elementos armazenados no vetor que são superiores a 15
 */
package Exercer03;

import java.util.Scanner;

public class Vetor016 {
    public static void main(String[] args) {
        Scanner milla = new Scanner(System.in);

        int[] vetorA = new int[10];
        for (int i=0; i<vetorA.length; i++) {
            System.out.println("Entre com o valor da posiçao " + i);
            vetorA[i] = milla.nextInt();
        }
        int somaInferior = 0;
        int somaIgual = 0;
        int somaMaior = 0;
        int qtdMaior = 0;

        for (int i=0; i<vetorA.length; i++)
        {
            if (vetorA[i] < 15) {
                somaInferior += vetorA[i];

            }
            else if (vetorA[i] == 15) {
                somaIgual++;
            }
            else {
                qtdMaior++;
               somaMaior += vetorA[i];

            }

        }
        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i] + " ");

        }
        System.out.println();

        System.out.println("SUPERIOR: "+ somaMaior);
        System.out.println(" IGUAL "+ somaIgual);
        System.out.println(" INFERIOR " + somaInferior);
        System.out.println(" MEDIA  " + (somaMaior/qtdMaior));
    }
}