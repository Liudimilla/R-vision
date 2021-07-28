package Exercer13;

public class PessoaJuridica extends ImpostoDeRenda {
    private String cnpj;


    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public double calcularImposto() {
        return this.getRendaBruta() * 0.1;
        //OPcao 2:: this.getRendaBruta()/100)*10;
    }

    @Override
    public String toString() {
        String s ="Pessoa Juridica ||";
        s += super.toString();
        s += " ;CNPJ: " + cnpj;
        s += " ;Imposto a ser pago: " + calcularImposto();
        s += "||";
        return s;
    }
}
