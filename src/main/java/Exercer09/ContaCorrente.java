/*Questao 32.2; Cria  uma  classe  para  representar  uma  conta  corrente  que  possui
um número, um  saldo,  um  status  que  informa  se  ela  é  especial  ou  não,  um   limite.
Desenvolva  métodos  para  realizar  saque  (verificando  se  o  cliente   pode  realizar  saques),
 despositar  dinheiro,  consultar  saldo  e  verificar  se  o   cliente  está  usando  cheque
 especial  ou  não.  Desenvolva  um  programa   para  testar  essa  classe.
 */
package Exercer09;

import java.util.Scanner;

public class ContaCorrente {
    String numConta;
    String valor;
    boolean saldo;
    boolean status;

    void dados() {
        System.out.println("Numero da conta: " + numConta + "\n Saldo da conta" + valor + "  ");
    }


    void consultar () {
        saldo = true;
    }
    void consultarSem () {
        saldo = false;

    }
    void realizarSaque(){
        if (saldo) {
            System.out.println("Tem saldo para realizar saque");
        } else {
            System.out.println("Nao tem saldo para realizar saque");
        }
    }




    ////////
    void limite () {
        status = true;
     }
     void semLimite () {
        status = false;

     }
     void verificarSaldo () {
        if (status) {
            System.out.println("Cliente nao esta usando o saldo especial");
        } else {
            System.out.println("Cliente esta usando o saldo especial");
        }
     }
    }

