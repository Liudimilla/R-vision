/*Questao 16.18.Faça um Programa que peça um número inteiro e determine se ele
 é par ou impar. Dica: utilize o operador módulo (resto da divisão). */
package Exercer02;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = scan.nextInt();

        if(num % 2 ==0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }


    }
}
