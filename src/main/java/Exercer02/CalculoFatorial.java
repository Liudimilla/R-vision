/*Questao 17.17.Faça um programa que calcule o fatorial de um número inteiro
fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120
 */
package Exercer02;

import java.util.Scanner;

public class CalculoFatorial {
    public static void main(String[] args) {
        Scanner milla = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = milla.nextInt();

        System.out.println(num + " ! = ");

        int fatorial = 1;
        for (int i = num; i > 0; i--) {
            fatorial *= i;
            System.out.println(i);
        }
        System.out.println("Resultado: " + fatorial);
    }
}

