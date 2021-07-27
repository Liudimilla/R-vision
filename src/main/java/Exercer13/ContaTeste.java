package Exercer13;

public class ContaTeste {
    public static void main(String[] args) {
        System.out.println("##### Teste ContaBancaria #####");

        ContaBancária contaSimples = new ContaBancária();
        contaSimples.setNomeCliente("Cliente Conta Simples");
        contaSimples.setNumConta("123456");

        contaSimples.depositar(100);

        realizarSaque(contaSimples, 50);
        realizarSaque(contaSimples, 70);


        System.out.println(contaSimples);
        ////////////////////////////////////////////
        System.out.println("\n****** Teste ContaPoupança ******");

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setNomeCliente("Cliente Conta Poupança");
        contaPoupanca.setNumConta("90891234");
        contaPoupanca.setDiaRendimento(7);

        contaPoupanca.depositar(600);

        realizarSaque(contaPoupanca, 500);
        realizarSaque(contaPoupanca, 900);

        if (contaPoupanca.calcularNovoSaldo(0.5)) {
            System.out.println("Rendimento aplicado, novo saldo e de = " + contaPoupanca.getSaldo());
        } else {
            System.out.println("Hoje nao e dia de rendimento, novo saldo nao calculado");
        }
        System.out.println(contaPoupanca);

    ////////////////////////////////////////////
        System.out.println("\n****** Teste ContaEspecial ******");

    ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setNomeCliente("Cliente Conta Especial");
        contaEspecial.setNumConta("0090234");
        contaEspecial.setLimite(50);

        contaEspecial.depositar(100);

    realizarSaque(contaEspecial, 50);
    realizarSaque(contaEspecial, 70);
    realizarSaque(contaEspecial, 80);
        System.out.println("contaEspecial");
}

    private static void realizarSaque(ContaBancária conta, double valor) {
        if (conta.sacar(valor)) {
            System.out.println("Saque efetuado com sucesso, novo saldo = " + conta.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para saque " + valor + "; Saldo de = " + conta.getSaldo());
        }
    }
}


