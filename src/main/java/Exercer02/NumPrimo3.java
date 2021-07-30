/*Questao 17.29::Encontrar números primos é uma tarefa difícil. Faça um
programa que gera uma lista dos números primos existentes entre 1 e um número inteiro
informado pelo usuário */
package Exercer02;

import java.util.Scanner;

public class NumPrimo3 {
    public static void main(String[] args) {
        Scanner milla = new Scanner(System.in);

        System.out.println("Entre com o numero");
        int num = milla.nextInt();

        for (int i=1; i<=num; i++) {

        boolean primo = true;

        for (int j=2; j<i; j++) {
            if (i % j == 0) {
                //System.out.println("Nao e um numero primo - Divisivel por " + i);
                primo = false;
            }
        }
        if(primo){
            System.out.println(i);
        }
    }
    }
}
