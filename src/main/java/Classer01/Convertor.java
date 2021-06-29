package Classer01;
//Questao 13.4;Faça um programa que converta metros para centimetros.

import java.util.Scanner;

public class Convertor {
    public static void main(String [] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("Digite o metro");
        double metro = x.nextInt();

        double conv = metro * 100;

        System.out.println("O valor em centimetros:" +conv);

    }
}
