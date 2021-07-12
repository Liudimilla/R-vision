/* Questao 11.Faça um Programa que peça 2 números inteiros e um número real.
Calcule e mostre:
a. o produto do dobro do primeiro com metade do segundo .
b. a soma do triplo do primeiro com o terceiro.
c. o terceiro elevado ao cubo.
 */
package Exercer01;

import java.util.Scanner;

public class CalculoValores {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um numero inteiro: ");
        int num1 = scan.nextInt();

        System.out.println("Entre com um numero inteiro: ");
        int num2 = scan.nextInt();

        System.out.println("Entre com um numero inteiro: ");
        double num3 = scan.nextDouble();

        int resul1 = (num1*2) * (num2/2);
        double resul2 = (num1*3) + num3;
        double resul3 = Math.pow(num3,3);

        System.out.println("o produto do dobro do primeiro com metade do segundo: " +resul1);
        System.out.println("a soma do triplo do primeiro com o terceiro " +resul2);
        System.out.println("o produto do dobro do primeiro com metade do segundo: " +resul3);
    }
}
