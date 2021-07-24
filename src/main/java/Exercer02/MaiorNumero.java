// Questao 17.7;Faça um programa que leia 5 numeros e infome o maior.
package Exercer02;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int menor;
        int maior = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++){

            System.out.println("Informe um valor");
            int numl = scan.nextInt();

                if (numl > maior) {
                    maior = numl;
                }
        }
                System.out.println("O maior número lido foi: " + maior);
            }
        }
