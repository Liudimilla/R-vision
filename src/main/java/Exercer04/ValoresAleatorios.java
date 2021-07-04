/*Questao 20.1; Gere e imprima uma matriz M 4x4 com valores aleatórios
entre 0- 9. Após isso determine o maior número da matriz e a sua posição
(linha, coluna).
 */
package Exercer04;

import java.util.Random;

public class ValoresAleatorios {
    public static void main(String[] args) {
        int[][] numerosAleatorios = new int[4][4];
        Random numeroRandom = new Random();

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                numerosAleatorios[i][j] = numeroRandom.nextInt(100);
            }
        }
        int maior = 0;
        int linha = 0;
        int col = 0;
        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                if (numerosAleatorios[i][j] > maior) {
                    maior = numerosAleatorios[i][j];
                    linha = i;
                    col = j;
                }
            }

        }
        System.out.println("Maior valor = " + maior);
        System.out.println("Linha = " + linha);
        System.out.println("Maior valor = " + col);

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                System.out.print(numerosAleatorios[i][j] + " ");
            }
            System.out.println();
        }
    }
}
