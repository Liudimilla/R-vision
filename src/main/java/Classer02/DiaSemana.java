/*Questao 15.13; Faça um Programa que leia um número e exiba o dia correspondente da semana.
(1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido.
 */
package Classer02;

import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o dia da semana:\n 1- Segunda\t ; 2-Terça\t ; 3-quarta\t ; 4-quinta\t ; 5-sexta\t ; 6-sabado\t ; 7- Domingo;");
   int semana = scan.nextInt();
        if (semana == 1) {
            System.out.println("O dia da semana e segunda-feira ");
        }
        else if (semana == 2) {
            System.out.println("O dia da semana e terça-feira ");
        }
        if (semana == 3) {
            System.out.println("O dia da semana e quarta-feira ");
        }
        if (semana == 4) {
            System.out.println("O dia da semana e quinta-feira ");
        }
        if (semana == 5) {
            System.out.println("O dia da semana e sexta-feira ");
        }
        if (semana == 6) {
            System.out.println("O dia da semana e sabado ");
        }
        if (semana == 7) {
            System.out.println("O dia da semana e domingo ");
        }
       else {
            System.out.println("Nao e um dia da semana valido");
        }


    }
}
