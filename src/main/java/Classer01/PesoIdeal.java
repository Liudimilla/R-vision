//Questao 13.12; Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo
//que calcule seu peso ideal, usando a seguinte formula:(72.7*altura)-58;
package Classer01;

import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o seu altura: ");
        float al = scan.nextFloat();

        double ideal = ((72.7 * al) - 58);

    System.out.println(" Seu peso ideal: " + ideal);
}
}