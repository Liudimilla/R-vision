/*Questao 16.14.Faça um programa que lê as duas notas parciais obtidas por um
aluno numa disciplina ao longo de um semestre, e calcule a sua média. A atribuição de
conceitos obedece à tabela abaixo: o Média de Aproveitamento Conceito o
Entre 9.0 e 10.0 A o
Entre 7.5 e 9.0 B o
Entre 6.0 e 7.5 C o
Entre 4.0 e 6.0 D o
Entre 4.0 e zero E O
algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem
 “APROVADO” se o conceito for A, B ou C ou “REPROVADO” se o conceito for D ou E. */

package Exercer02;


import java.util.Scanner;

public class NotaSemestral {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Informe a primeira nota: ");
        float nota1 = scan.nextInt();
        System.out.println("Informe a segunda nota: ");
        float nota2 = scan.nextInt();

        double aval = (nota1 + nota2)/2;

        if (aval == 9.0 && aval>= 10){
            System.out.println("Conceito A");
        }
        if (aval >= 7.5 && aval < 9) {
            System.out.println("Conceito B");
        }
        if (aval >=6 && aval >= 7.5 ){
            System.out.println("Conceito C");
        }
        if (aval >= 4 && aval >= 6 ){
            System.out.println("Conceito D");
        }
        if (aval >= 0 && aval < 4){
            System.out.println("Conceito E");
        }

        System.out.println("Nota 1: " +nota1);
        System.out.println("Nota 2: " +nota2);
        System.out.println("Media: " +aval);


    }
}
