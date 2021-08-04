package Exercer05;

public class ExercContaCorrente {
    public static void main(String[] args) {

        ContaCorrente dados = new ContaCorrente();
        dados.nomeBanco = " Charlatão SLA ";
        dados.Agencia = "1234";
        dados.numero = "234578";
        dados.especial = true;
        dados.limiteEspecial = 500;
        dados.saldo = -10;

        System.out.println("¨¨¨¨¨¨Dados da sua Conta¨¨¨¨¨¨¨¨");
        System.out.println("Nome do banco: " +dados.nomeBanco);
        System.out.println("Numero do Agencia: " +dados.Agencia);
        System.out.println("Numero do Conta: " +dados.numero);
        System.out.println("Status da conta Especial: "+dados.especial);
        System.out.println("Limite da conta: "+dados.limiteEspecial);
        System.out.println("Saldo: "+dados.saldo);


    }



}
