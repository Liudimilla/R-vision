//Questao 15.2;Faça um programa que verifique se uma tela digitada e "F" ou "M".Conforme a letra
// escrever: F - Feminino, M - Masculino, Sexo Invalido.
package Classer02;

import java.util.Scanner;

public class InformacaoSexo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean  F,M;
        System.out.println("Digite seu sexo F - Feminino, M - Masculino ");
        String sexo = scan.next();

        if (sexo.equalsIgnoreCase( "F")) {
            System.out.println("Feminino");
        }
        if (sexo.equalsIgnoreCase("M")) {
            System.out.println("Masculino");
        } else {
            System.out.println("Sexo Invalido");
        }

//Obs.: Qdo se usa variavel string para fazer comparaçao e melhor usar
      //  equalsIgonoreCase.
    }
}
