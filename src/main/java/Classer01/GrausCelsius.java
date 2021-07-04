//Questao 13.9; Faça um programa que peça a temperatura em graus Farenheit,transfome e mostree
//a temperatura em graus Celsus. C=(5*(F-32)/9).

package Classer01;

import java.util.Scanner;

public class GrausCelsius {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a temperatura em Grau Farenheit");
        float tem = scan.nextFloat();

        float c = (5 * (tem - 32) / 9);

        System.out.println("A Sua temperatura em Graus Celsius e: " + c);
    }
}