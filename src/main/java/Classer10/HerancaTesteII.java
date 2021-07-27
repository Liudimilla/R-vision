//Al40 = Polimorfismo
package Classer10;
public class HerancaTesteII {
    public static void main(String[] args) {
        HerancaPess pessoa = new HerancaPess();
        HerancaAlun aluno = new HerancaAlun();
        HerancaProf professor = new HerancaProf();

        pessoa.setEndereço("Rua Pedroso 12: Bairro Sao Judas");
        aluno.setEndereço("Rua Sao Carlos 122: Bairro Sao Joao");
        professor.setEndereço("Rua Maria Luiza 10: Bairro Sao Lucas");

        System.out.println(pessoa.obterEtiquetaEndereco());
        System.out.println(aluno.obterEtiquetaEndereco());
        System.out.println(professor.obterEtiquetaEndereco());
    }
}
