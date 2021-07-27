/*Questao 43.1::. Elabore uma classe ContaBancaria com os seguintes atributos:$ • nomeCliente • numConta • saldo
E os seguintes métodos: • sacar(o saldo não pode ficar negativo)
• depositar Crie também duas subclasses chamadas ContaPoupanca e ContaEspecial, com as
seguintes características:
 ContaPoupanca = atributo$diaRendimento • método calcularNovoSaldo, recebe taxa de
 rendimento da poupaça e atualiza o saldo
 ContaEspecial = atributo limite • sobrescreva o método sacar com a nova lógica
 necessária Crie uma classe Teste que contenha a seguinte lógica:
• Criar contas • Sacar um valor das contas
• Depositar • Mostrar um novo saldo a partir de um rendimento
• Mostrar os dados da conta do cliente
 */
package Exercer13;
public class ContaBancária {

    private String nomeCliente;
    private String numConta;
    private double saldo;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
// Para fazer a saida dos atributos;
    @Override
    public String toString() {
        String s = "ContaBancaria: \n[ ";
        s += " : \nnomeCliente: " + nomeCliente;
        s += " : \nnomeConta: " + numConta;
        s += " \nsaldo: " + saldo;
        s += "]";
        return s;
    }
    //Criaçao de Metodos;
    public void depositar(double valor) {
        saldo += valor;
    }
    public boolean sacar (double valor) {
        if((saldo-valor) >=0) {
        saldo -= valor;
        return true;
}
        return false;
    }

}