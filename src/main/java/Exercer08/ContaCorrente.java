/* Exerc 27.2.: Cria  uma  classe  para  representar  uma  conta  corrente
que  possui  um   número,  um  saldo,  um  status  que  informa  se  ela
é  especial  ou  não,  um   limite. Desenvolva  métodos  para  realizar
saque  (verificando  se  o  cliente   pode  realizar  saques),  despositar
dinheiro,  consultar  saldo  e  verificar  se  o   cliente  está  usando
cheque  especial  ou  não.  Desenvolva  um  programa   para  testar  essa
classe. */
package Exercer08;
public class ContaCorrente {
       String numConta;
        String agencia;
        boolean especial;
        double limiteEspecial;
        double valorEspecialUsado;
        double saldo;


        public boolean realizarSaque(double quantiaSacar){
                if (saldo > quantiaSacar) {
                        saldo -= quantiaSacar;
                        return true;
                } else {
                        if (especial) {
                                double limite = limiteEspecial + saldo;
                                if (limite>=quantiaSacar) {
                                        saldo -= quantiaSacar;
                                        return true;
                                } else {
                                        return false;
                                }
                        } else {
                                return false;//nao e especial
                        }
                }
        }
        public void depositar (double valorDeposito) {
                saldo += valorDeposito;
        }
        public void consultarSaldo () {
                System.out.println("Saldo atual da conta = " +saldo);

        }
        public boolean verificarUsoChequeEspecial() {
                return saldo < 0;
        }
    }

