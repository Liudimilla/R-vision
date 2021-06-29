package Classer01;
//Questao 13.2;Faça um programa que peça dois numeros e imprima a soma

import java.util.Scanner;

public class Leitor {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Digite o primeiro um numero");
        int num1 = x.nextInt();

        System.out.println("Digite o segundo numero");
        int num2 = x.nextInt();

        System.out.println(" A soma dos seus numeros sao:" + (num1 + num2));
    }
}
