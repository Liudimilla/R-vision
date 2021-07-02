// Questao 15.9;Faça um programa que leia tres numeros e mostre-os em ordem decrescente
package Classer02;

import java.util.Scanner;

public class OrdemDecrescente {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int num1 = scan.nextInt();
        System.out.println("Digite o segundo numero: ");
        int num2 = scan.nextInt();
        System.out.println("Digite o terceiro numero: ");
        int num3 = scan.nextInt();

        if (num1 > num2) {
            System.out.println(" " + num1);
        }  if (num2 > num1) {
            System.out.println(" " + num2);
        }if (num1 > num3) {
            System.out.println(" " + num1);
        }
        if (num3 > num1) {
            System.out.println(" " + num3);
        } if (num3 > num2) {
            System.out.println(" " + num3);
        } if (num2 > num3) {
            System.out.println(" " + num2);
        }
    }
}
