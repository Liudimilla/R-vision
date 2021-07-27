package Classer11;

public class AbstractProf extends AbstractPess {

    private double salario;
    private String [] nomeCurso;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String[] getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String[] nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    public double calcularSalarioLiquido() {
        return 0;

    }
    public String obterEtiquetaEndereco() {
        String s = "Endereco do professor: ";
        s += super.getEndereço();
        return  s;
    }

    @Override
    public void bterEtiquetaEndereco() {
        System.out.println("imprimindo endereço do professor");
        System.out.println(this.obterEtiquetaEndereco());

    }
}
