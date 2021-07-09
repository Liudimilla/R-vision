package Classer01;

import java.util.Scanner;

//Questao 13.6;Faça programa que peça o raio de um circulo, calcule e mostre sua area.
//A = π . r2
public class AreaCircule {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o valor da raio: " );
        double r = scan.nextDouble();
        double a;
        a = 3.14 * (r*r);
        // OPÇAO 2 ; double area = Math.PI * Math.pow(raio,2);

        System.out.println("O valor da " +a);

    }
}
