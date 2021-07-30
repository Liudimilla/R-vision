/*33.Criar um vetor A com 10 elementos inteiros. Escreva um programa que imprima cada elemento do vetor A e uma mensagem indicando se o respectivo elemento é um número primo ou não. */
package Exercer03;

import java.util.Scanner;

public class Vetor033 {
    public static void main(String[] args) {
        Scanner milla = new Scanner(System.in);

        int[] vetorA = new int[5];

        for (int i=0; i<vetorA.length; i++) {
            System.out.println("Entre com o valor da posiçao A - " + i);
            vetorA[i] = milla.nextInt();
        }
        boolean primo;
        for (int i=0; i<vetorA.length; i++) {
           primo = true;
            for (int j=2; j<vetorA[i]; j++) {
                if(vetorA[i] % j == 0) {
                    primo = false;
                    break;
                }
            }
            String msg = " ";
            if (primo) {
                msg = " : primo";
            } else {
                msg = " : nao e primo";
            }
            System.out.println(vetorA[i]+msg);
        }

        }
}
