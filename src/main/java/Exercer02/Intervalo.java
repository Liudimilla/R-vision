/* Questao 17.10.Faça um programa que receba dois números inteiros e
 gere os números inteiros que estão no intervalo compreendido por eles
 . */
package Exercer02;

import java.util.Scanner;

public class Intervalo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int num1 = scan.nextInt();
        System.out.println("Digite o segundo numero: ");
        int num2 = scan.nextInt();

        for (int i=num1; i<=num2; i++) {
            System.out.println(i);
        }

    }
}
