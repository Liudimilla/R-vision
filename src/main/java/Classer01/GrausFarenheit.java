//Questao 13.10; Faça um programa que peça a temperatura em graus Celsius,transfome e mostree
//a temperatura em graus Farenheit.
package Classer01;

import java.util.Scanner;

public class GrausFarenheit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe sua temperatura em Graus Celsius: ");
        float tem = scan.nextFloat();

        double f = (1.8 * tem )+32;

        System.out.println(" sua temperatura em Grau Farenheit e: " + f);
    }
}
