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
    int limiteEsp;
    double valorEspecialUsado = 0;
    boolean liberado;
    boolean especial;
    int qsacar;


    boolean realizarSaque(double qSacar) {
        //tem saldo na conta
        if (saldo < qSacar) {
            saldo -= qSacar;
            return true;
        } else { // nao tem saldo na conta   */
            if (especial) {
                double limite = limiteEsp + saldo;
                if (limite >= qsacar) {
                    saldo -= qsacar;
                    return true;
                } else {
                    return false;
                }

            } else {
                return false;
            }


        }


    }

    void depositar(double valorDepositado) {
        saldo += valorDepositado;
    }
    void consultarSaldo() {
        System.out.println("Saldo atual da conta = "+saldo);
    }
    boolean verificarUsoChequeEspecial() {
        return saldo < 0;
    }
}


