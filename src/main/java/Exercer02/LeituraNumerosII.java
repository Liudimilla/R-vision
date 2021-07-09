/* Questao 14.7. Faça um Programa que leia três números e mostre o
maior e o menor deles. */
package Exercer02;

import java.util.Scanner;

public class LeituraNumerosII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um o primeiro numero: ");
        int num1 = scan.nextInt();
        System.out.println("Digite um o segundo numero: ");
        int num2 = scan.nextInt();
        System.out.println("Digite um o terceiro numero: ");
        int num3 = scan.nextInt();
        if (num1 >= num2 &&  num1 >=num3) {
            System.out.println(" O primeiro e o maior numero e:"+ num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("O segundo e o maior numero e:" +num2);
        } else if (num3 >= num1 && num3 >=num2) {
            System.out.println("O terceiro e o maior numero e:" +num3);
        }

        if (num1 <= num2 &&  num1 <=num3) {
            System.out.println(" O primeiro e o menor numero e:"+ num1);
        } else if (num2 <= num1 && num2 <= num3) {
            System.out.println("O segundo e o menor numero e:" +num2);
        } else if (num3 <= num1 && num3 <=num2) {
            System.out.println("O terceiro e o menor numero e:" +num3);
        }
    }
}
