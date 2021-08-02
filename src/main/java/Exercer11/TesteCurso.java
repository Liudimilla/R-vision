//Questao 36.2
package Exercer11;

import Exercer09.Aluno;

import java.util.Scanner;

public class TesteCurso {
    public static void main(String[] args) {
        Scanner milla = new Scanner(System.in);

        System.out.println("Entre com o nome do curso");
        String nome = milla.nextLine();

        System.out.println("Entre com o horario do curso");
        String horario = milla.nextLine();

        System.out.println("Entre com o nome do professor");
        String nomeProf = milla.nextLine();

        System.out.println("Entre com o nome do curso: ");
        String departamento = milla.nextLine();

        System.out.println("Entre com o email do curso: ");
        String email = milla.nextLine();

        DadosCurso curso = new DadosCurso();
        curso.setNome(nome);
        curso.setHorario(horario);

        DadosProfessor professor = new DadosProfessor();
        professor.setNome(nomeProf);
        professor.setDepartamento(departamento);
        professor.setEmail(email);

        curso.setProfessor(professor);

        System.out.println("----Alunos-----");

        DadosAluno[] alunos = new DadosAluno[5];
        for (int i=0; i<5; i++) {

            milla.nextLine();

            System.out.println("Entre com o nome do aluno "+(i+1));
            String nomeAluno = milla.nextLine();

            System.out.println("Entre com o matricula do ano");
            String nomeMatricula = milla.nextLine();

            double[] notas = new double[4];

            for (int j=0; j<4; j++) {
                System.out.println("Entre com a nota "+(j+1));
                notas[i] = milla.nextDouble();
            }
            DadosAluno aluno = new DadosAluno();
            aluno.setNome(nomeAluno);
            aluno.setMatricula(nomeMatricula);
            aluno.setNota(notas);

            alunos[i] = aluno;
        }
        curso.setAlunos(alunos);
        System.out.println(curso.obterInfo());
    }
}
