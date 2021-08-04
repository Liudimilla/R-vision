// Exerc 27.2.:
package Exercer08;



public class ContaTest {
    public static void main(String[] args) {

      ContaCorrente poupanca = new ContaCorrente();
        poupanca.agencia = "8960";
        poupanca.numConta = "906723";
        poupanca.saldo = -10;
        poupanca.limiteEspecial = 500;
        poupanca.especial = true;
        poupanca.valorEspecialUsado = 0;

        System.out.println("numero da conta: " + poupanca.numConta+ " ; Saldo = " +poupanca.saldo);

        boolean saqueEfetuado = poupanca.realizarSaque(10);
        if (saqueEfetuado) {
            System.out.println("Saque efetuado com sucesso");
            poupanca.consultarSaldo();
        } else {
            System.out.println("Nao foi possivel realizar saque. Saldo insuficiente");
        }

        System.out.println("Deposito de 500 reais");
        poupanca.depositar(500);
        poupanca.consultarSaldo();
        saqueEfetuado = poupanca.realizarSaque(500);
        if (poupanca.verificarUsoChequeEspecial()) {
            System.out.println("Esta usando cheque especial");
        } else {
            System.out.println("Nao esta usando cheque especial");
        }
    }
}
