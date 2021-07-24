//Exerc 4 ::.
package Exercer09;

public class ContaCorrenteExerc4 {
    public static void main(String[] args) {

        ContaCorrente poupanca = new ContaCorrente();
        poupanca.setAgencia("8960");
        poupanca.setNumConta("906723");
        poupanca.setSaldo(-10);
        poupanca.setLimiteEspecial(500);
        poupanca.setEspecial(true);

        System.out.println("numero da conta: " + poupanca.getNumConta() + " ; Saldo = " +poupanca.getSaldo());

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

        if (poupanca.verificarUsoChequeEspecial()) {
            System.out.println("Esta usando cheque especial");
        } else {
            System.out.println("Nao esta usando cheque especial");
        }
    }
}
