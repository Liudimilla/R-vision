package Classer11;

public class FinalTeste {
    public static void main(String[] args) {

        FinalAlun aluno = new FinalAlun();
        FinalProf professor = new FinalProf();
        FinalPess pessoa = new FinalPess();

        //exemplo 2;
        System.out.println(Constantes.URL_BLOG);
        Constantes.URL_BLOG = "Atualizaçao";
        System.out.println(Constantes.URL_BLOG);

    }
}
