package Exercer09;

public class TestaContaCorrente {
    public static void main(String[] args) {

        ContaCorrente itau = new ContaCorrente();
        itau.numConta = "896712";
        itau.valor = "2.000";

        System.out.println(itau.numConta);
        System.out.println(itau.valor);

        itau.dados();
    }
}
