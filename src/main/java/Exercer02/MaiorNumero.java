// Questao 17.7;Faça um programa que leia 5 numeros e infome o maior.
package Exercer02;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int menor;
        int maior;

        final int CONTADOR = 5;

        System.out.println("Informe um valor");
        int numl = scan.nextInt();

          maior = numl;
          menor = numl;

        for (int i = 1; i < CONTADOR; i++) {
            System.out.println("Informe um valor");
            numl = scan.nextInt();



            if (numl > maior) {
                maior = numl;
            }
            if (numl < menor) {
                menor = numl;
            }

            System.out.println("O menor número lido foi: " + menor);
            System.out.println("O maior número lido foi: " + maior);
        }
    }
}
