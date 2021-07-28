/*Questao 17.22::Faça um programa que calcule o valor total investido por um colecionador
 em sua coleção de CDs e o valor médio gasto em cada um deles. O usuário deverá informar
 a quantidade de CDs e o valor para em cada um. */
package Exercer02;

import java.util.Scanner;

public class InvestimentoCD {
    public static void main(String[] args) {
        Scanner milla = new Scanner(System.in);

        System.out.println("informe a quantidade: ");
        int quat = milla.nextInt();

        double preco = 0;
        double soma = 0;

        for (int i=1; i<=quat; i++) {

            System.out.println("informe o valor: " + i);
            preco = milla.nextDouble();
            soma += preco;
        }
        double media = soma / quat;
        System.out.println("Media gasta com cada CD: "+ media);
    }
}
