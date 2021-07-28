/*Questao 43.2::.A Receita Federal possui um cadastro dos contribuintes. Cada contribuinte$
!! possui nome. Escreva um programa para calcular o imposto a ser pago para 5 contribuintes.
Os contribuintes podem ser: Pessoa Jurídica O imposto corresponde a 10% da renda bruta da
empresa.
Pessoa$Física: Renda Bruta Alíquota Parcela a deduzir 0 a1400 0% R$0 1400,01 a 2100
10% R$100 2100,01 a 2800 15% RS270 2800,01 a 3600 25% R$500 3600,01ou mais 30% RS700
Escreva um programa para calcular e imprimir na tela o imposto a ser pago de
6 contribuintes, sendo 3 PJ e 3 PF
 */
package Exercer13;
//contribuinte:
public abstract class ImpostoDeRenda {
    private String nome;
    private double rendaBruta;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }
    public abstract double calcularImposto();

    @Override
    public String toString() {
        String s = "Nome: "+nome;
        s += " ;rendaBruta: "+rendaBruta;
        return s;

    }
}
