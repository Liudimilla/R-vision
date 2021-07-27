package Classer11;

import Exercer08.Aluno;

public class Teste {
    public static void main(String[] args) {

        FinalAlun aluno = new FinalAlun();

        aluno.setCurso("Ciencias da computaçao");
        double[] notas = {10, 9, 8, 7};
        aluno.setNotas(notas);

        System.out.println(aluno);

        //comparando objetos;
        String s1 = "Uninove";
        String s2 = "Uninove";

        System.out.println(s1.equals(s2));

        FinalAlun aluno2 = new FinalAlun();
        aluno2.setCurso("Sistemas da informaçao");
        double[] notas2 = {10, 9, 8, 7};
        aluno2.setNotas(notas2);

        //comparar referencia;
        System.out.println(aluno == aluno2);





    }
}
