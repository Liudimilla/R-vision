package Exercer08;

import Exercer09.Aluno;

import java.util.Scanner;

public class AlunoTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Entre com o nome do aluno");
        aluno.nome = scan.next();

        System.out.println("Entre com o nome do curso");
        aluno.curso = scan.next();

        System.out.println("Entre com a matricula");
        aluno.matricula = scan.next();

    }
}
