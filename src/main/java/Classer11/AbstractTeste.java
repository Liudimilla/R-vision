package Classer11;

import Classer09.HerancaAlun;
import Classer09.HerancaPess;
import Classer09.HerancaProf;

public class AbstractTeste {
    public static void main(String[] args) {

        //AbstractPess pessoa = new AbstractPess();
        AbstractAlun aluno = new AbstractAlun();
        AbstractProf professor = new AbstractProf();

        //pessoa.setEndereço("Rua Crista,nº90");
        aluno.setEndereço("Rua Ofensa,nº1000");
        professor.setEndereço("Rua Salvador,nº891");

        System.out.println("AbstractTeste.main");
        //System.out.println(aluno.obterEtiquetaEndereco());
        //System.out.println(professor.obterEtiquetaEndereco());
         aluno.bterEtiquetaEndereco();
         professor.bterEtiquetaEndereco();
    }
}
