//Al 37 .::
package Classer10;

public class HerancaAlun extends HerancaPess {

    private String curso;
    private double[] notas;

    public void verificarAcesso() {
        this.nomeVisibilidade = "Liberado";
        super.nomeVisibilidade = "Liberada";

        super.setNomeVisibilidade("Liberadissimo");

    }

    public HerancaAlun() {
        super();
    }

    public HerancaAlun(String nome, String endereço, String telefone, String curso) {
        super(nome, endereço, telefone);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        return 0;
    }

    public boolean verificarAprovado() {
        return true;

    }

    public void metodoQualquer() {
        super.setCpf("2314567");
        this.setTelefone("2345-1234");

    }

    public String obterEtiquetaEndereco() {
        String s = "Endereço do aluno: ";
        s += super.getEndereço();

        return s;
    }
}