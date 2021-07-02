//Questao 13.7;Faça um programa que calcule a area de uma quadrado, em seguida mostre o dobro desta área para o usuario.
package Classer01;

import java.util.Scanner;

public class CalculeArea {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a area");
        double area = scan.nextDouble();

        double Cal = area * area;

        System.out.println("O calculo da area e: " + Cal);






    }
}
