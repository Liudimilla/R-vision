//Questao 15.1;Faça um programa que peça um valor e mostre na tela se o valor e posito ou negativo.
package Classer02;

import java.util.Scanner;

public class PositoNegativo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um o primeiro numero: ");
        int num1 = scan.nextInt();


        if (num1>=0) {
            System.out.println("O Numero e positivo: "+num1);

        }
        else {
            System.out.println("O Numero e negativo : "+num1);

        }
    }
}
