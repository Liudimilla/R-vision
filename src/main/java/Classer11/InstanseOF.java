package Classer11;

import Exercer08.Aluno;

public class InstanseOF {
    public static void main(String[] args) {

        FinalPess pessoa = new FinalPess();
        AbstractAlun aluno = new AbstractAlun();
        AbstractProf professor = new AbstractProf();

        if (pessoa  instanceof FinalPess) {
            System.out.println(" é do tipo Pessoa");
        }
        if (professor instanceof AbstractProf) {
            System.out.println(" é do tipo Professor");
        }
        if (aluno instanceof AbstractAlun) {
            System.out.println(" é do tipo Aluno");
        }
    }
}


