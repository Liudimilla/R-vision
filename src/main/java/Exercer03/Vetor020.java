/*Questao 19.20::.Implementar um programa que obtenha a cotação do dólar , euro, libra e bitcoin($) em relação ao
real (R$) e a seguir armazene em vetor A com 3 elementos as seguintes conversões:
 */
package Exercer03;

import java.util.Scanner;

public class Vetor020 {
    public static void main(String[] args) {
        Scanner milla = new Scanner(System.in);

        double[] vetorA = new double[3];
        double[] vetorB = new double[3];
        double[] vetorC = new double[3];
        double[] vetorD = new double[3];

        //double[] vetorB = new double[vetorA.length];
        double cotaçao, libra, euro, bitcoin;

        System.out.println("Entre com a cotaçao do dolar: ");
        cotaçao = milla.nextDouble();

        System.out.println("Entre com a cotaçao do libra: ");
        libra = milla.nextDouble();

        System.out.println("Entre com a cotaçao do euro: ");
        euro = milla.nextDouble();

        System.out.println("Entre com a cotaçao do bitcoin: ");
        bitcoin = milla.nextDouble();

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = cotaçao * (i + 1);
        }
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = libra * (i + 1);
        }
        for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] = euro * (i + 1);
        }
        for (int i = 0; i < vetorD.length; i++) {
            vetorD[i] = bitcoin * (i + 1);
        }
        System.out.print("O valor cotaçao =\n ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i] + "\t  :Dolar");
        }
        System.out.println();
        System.out.print("O valor libra =\n ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println(vetorB[i] + "\t  :Libra");
        }
        System.out.println();
        System.out.print("O valor euro =\n ");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.println(vetorC[i] + "\t  :Euro");
        }
        System.out.println();
        System.out.print("O valor bitcoin =\n ");
        for (int i = 0; i < vetorD.length; i++) {
            System.out.println(vetorD[i] + "\t  :Bitcoin");
        }
    }
}
