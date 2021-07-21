/*Questao 17.21.Faça um programa que calcule o número médio de alunos
por turma. Para isto, peça a quantidade de turmas e a quantidade de alunos
para cada turma. As turmas não podem ter mais de 40 alunos. */
package Exercer02;

import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner milla = new Scanner(System.in);

        System.out.println("Entre com o numero de alunos da turma: ");
        int numTurmas = milla.nextInt();


        int numAlunos;
        int soma = 0;
        boolean invalido = true;

        for (int i = 1; i < numTurmas; i++) {
            invalido = true;
            do {
                System.out.println("Entre com o numero de alunos da turma: " + i);
                numAlunos = milla.nextInt();

                if (numAlunos <= 40) {
                    invalido = false;
                } else {
                    System.out.println("numero de alunos invalidos. Digite novamente");

                }
            }while (invalido) ;
                soma += numAlunos;


            }
        double media = soma / numTurmas;
        System.out.println("Media: " +media);
    }
}

