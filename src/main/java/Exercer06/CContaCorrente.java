package Exercer06;

public class CContaCorrente {
    public static void main(String[] args) {

        ContaCorrente poupanca = new ContaCorrente();
        poupanca.agencia = 8960;
        poupanca.conta = 906723;
        poupanca.numero = 896712;
        poupanca.saldo = -10;
        poupanca.limiteEsp = 500;
        poupanca.especial = true;
        poupanca.status = "Dispinivel";


        System.out.println("numero da conta: " + poupanca.numero + " ; Saldo = " +poupanca.saldo);

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