/*Questao 20.2; Gere e imprima uma matriz M 10x10 com valores aleatórios
entre 0-9. Após isso indique qual é o maior e o menor valor da linha 5 e qual é o
maior e o menor valor da coluna 7.
 */
package Exercer04;

import java.util.Random;

public class MatrizMaiorMenor {
    public static void main(String[] args) {


        int[][] numeroAleatorios = new int[10][10];
        Random numeroRandom = new Random();
        for (int i=0; i<numeroAleatorios.length; i++) {
            for (int j=0; j<numeroAleatorios[i].length; j++) {
                numeroAleatorios[i][j] = numeroRandom.nextInt(100);
            }
        }
        int maiorL5 = 0;
        int menorL5 = 0;
        int linha5 = 5;
        for (int i=0; i<numeroAleatorios[linha5].length; i++) {
            if (numeroAleatorios[linha5][i] > maiorL5) {
                maiorL5 = numeroAleatorios[linha5][i];
            }
            if (numeroAleatorios[linha5][i] < menorL5) {
                menorL5 = numeroAleatorios[linha5][i];
            }
        }
        System.out.println("Maior valor da linha 5 = " + maiorL5);
        System.out.println("Menor valor da linha 5 = " + menorL5);

        int maiorC7 = 0;
        int menorC7 = 0;
        int col7 = 7;

        for (int i=0; i<numeroAleatorios.length; i++) {
            if (numeroAleatorios[i][col7] > maiorC7) {
                maiorC7 = numeroAleatorios[i][col7];
            }

            if (numeroAleatorios[i][col7] < menorC7) {
                menorC7 = numeroAleatorios[i][col7];

            }
        }
        System.out.println("Maior valor da coluna 7 = " + maiorC7);
        System.out.println("Menor valor da coluna 7 = " + menorC7);
    }
}