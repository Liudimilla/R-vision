/*Questao 25.2. Cria  uma  classe  para  representar  uma  conta  corrente  que
 possui  um   número,  um  saldo,  um  status  que  informa  se  ela  é  especial  ou  não,  um
   limite. Desenvolva  métodos  para  realizar  saque  (verificando  se  o  cliente   pode  realizar
    saques),  despositar  dinheiro,  consultar  saldo  e  verificar  se  o   cliente  está  usando
     cheque  especial  ou  não.  Desenvolva  um  programa   para  testar  essa  classe.
 */
package Exercer06;

public class ContaCorrente {
    int agencia;
    int conta;
    int numero;
    int saldo;
    String status;
    int limite;
    boolean liberado;

    public void realizarSaque() {
        if (liberado()) {
            System.out.println("Seu saque esta liberado");
        } else {
            System.out.println("Nao ha limite no momento");
        }
    }

    public void despositarDinheiro() {
        if (liberado()) {
            System.out.println("deposito realizado");
        } else {
            System.out.println("Conta nao localizada");

        }
    }

    private boolean liberado() {
        return true;
    }
    public void indisponivel() {
    }

    public void diponivel() {
    }
}
