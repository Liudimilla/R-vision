package Exercer06;

public class CContaCorrente {
    public static void main(String[] args) {

        ContaCorrente poupanca = new ContaCorrente();
        poupanca.agencia = 8960;
        poupanca.conta = 906723;
        poupanca.numero = 896712;
        poupanca.saldo = 3000;
        poupanca.limite = 1000;
        poupanca.status = "Dispinivel";
        poupanca.despositarDinheiro();
        poupanca.realizarSaque();
        poupanca.diponivel();

    }
}