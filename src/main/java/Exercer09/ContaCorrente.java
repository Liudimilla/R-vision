/*Questao 32.2; Cria  uma  classe  para  representar  uma  conta  corrente  que  possui
um número, um  saldo,  um  status  que  informa  se  ela  é  especial  ou  não,  um   limite.
Desenvolva  métodos  para  realizar  saque  (verificando  se  o  cliente   pode  realizar  saques),
 despositar  dinheiro,  consultar  saldo  e  verificar  se  o   cliente  está  usando  cheque
 especial  ou  não.  Desenvolva  um  programa   para  testar  essa  classe.
 */
package Exercer09;

import java.util.Scanner;

public class ContaCorrente {
    private String numConta;
    private String agencia;
    private boolean especial;
    private double limiteEspecial;
    private double saldo;


    public ContaCorrente( ) {

}
    public ContaCorrente(String numConta, String agencia, boolean especial, double saldo, double limiteEspecial ) {
        this.numConta = numConta;
        this.agencia = agencia;
        this.especial = especial;
        this.limiteEspecial = limiteEspecial;
        this.saldo = saldo;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

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

