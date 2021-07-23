package Exercer09;

import java.util.Scanner;

public class AlunoExerc3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Entre com o nome do aluno");
        aluno.setNome(scan.next());

        System.out.println("Entre com o nome do curso");
        aluno.setCurso(scan.next());

        System.out.println("Entre com a matricula");
        aluno.setMatricula(scan.next());

        for (int i=0; i<aluno.getNomeDisciplinas().length; i++) {
            System.out.println("Entre com a disciplina" +i);
            aluno.setNomeDisciplinaPos(i, scan.next());
        }

        for (int i=0; i<aluno.getNomeDisciplinas().length; i++) {
            System.out.println("Obtenha notas da disciplina " + aluno.getNomeDisciplinas()[i]);
            for (int j = 0; j < aluno.getNotaDisciplinas()[i].length; j++) {
                System.out.println("Entre com a nota " + (j + 1));
                aluno.setNomePodIJ(i, j, scan.nextDouble());
            }
        }
        aluno.mostrarInfo();

        for (int i=0; i<aluno.getNomeDisciplinas().length; i++) {
            if (aluno.verificarAprovado(i)) {
                System.out.println("Displina "+aluno.getNomeDisciplinas()[i] +" - foi aprovada");

                } else {
                    System.out.println("Displina "+aluno.getNomeDisciplinas()[i] + " - foi reprovado");
            }
            }
        }
    }
