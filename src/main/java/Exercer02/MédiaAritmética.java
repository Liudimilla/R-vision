/*Questao 17.19.Faça um programa que calcule o mostre a média aritmética de N notas.
 */
package Exercer02;

import java.util.Scanner;

public class MédiaAritmética {
    public static void main(String[] args) {
        Scanner milla = new Scanner(System.in);

        System.out.println("Entre com o numero de notas: ");
        int notas = milla.nextInt();

        double soma = 0;
        double media;
        double nota;

        for (int i=0; i<notas; i++) {
            System.out.println("Entre com a nota "+(i+1));
            nota = milla.nextDouble();
            soma += nota;
        }
        media = soma / notas;
        System.out.println("Soma: "+soma);
        System.out.println("Media: "+media);
    }
}
