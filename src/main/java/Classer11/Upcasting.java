package Classer11;

import Exercer09.Aluno;

public class Upcasting {

    public static void main(String[] arg) {
        AbstractAlun aluno = new AbstractAlun();
        AbstractPess pessoaAluno = aluno; // Ex.:  upcasting

        AbstractPess aluno2 = (AbstractPess) new AbstractAlun(); // Ex.:  upcasting

        AbstractPess aluno3 = new AbstractPess() {
            @Override
            public String obterEtiquetaEndereco() {
                return null;
            }

            @Override
            public void bterEtiquetaEndereco() {

            }
        };
        AbstractAlun aluno4 = (AbstractAlun) aluno3; // Ex.: Downcasting
    }

}
