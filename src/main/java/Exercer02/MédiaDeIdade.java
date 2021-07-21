/*Questao 17.20.Faça um programa que peça para n pessoas a sua idade, ao final o
programa devera verificar se a média de idade da turma varia entre 0 e 25,26 e 60 e maior
que 60; e então, dizer se a turma é jovem, adulta ou idosa, conforme a média calculada. */
package Exercer02;

import java.util.Scanner;

public class MédiaDeIdade {
    public static void main(String[] args) {
        Scanner milla = new Scanner(System.in);

        System.out.println("Entre com a quantidade de idade");
        int idades = milla.nextInt();
        int idade;
        int soma = 0;
        for (int i = 0; i < idades; i++) {
            System.out.println("Entre com a idade da pessoa" + (i + 1));
            idade = milla.nextInt();

            soma += idade;
        }
        double media = soma / idades;
        System.out.println("Média De Idade: "+ media);
    if (media >= 0 && media <=25) {
        System.out.println("Jovem");
    } else if (media >= 26 && media <=60) {
        System.out.println("Adulta");
    } else if (media > 60) {
        System.out.println("Idosa");
    }



    }

}
