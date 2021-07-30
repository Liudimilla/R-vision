/*Questao 17.28::Os números primos possuem várias aplicações dentro da Computação,
 por exemplo na Criptografia. Um número primo é aquele que é divisível apenas por um e por
  ele mesmo. Faça um programa que peça um número inteiro e determine se ele é ou não um
   número primo. */
package Exercer02;

import java.util.Scanner;

public class NumPrimo2 {
    public static void main(String[] args) {
        Scanner milla = new Scanner(System.in);

        System.out.println("Entre com o numero");
        int num = milla.nextInt();

        boolean primo = true;

        for (int i=2; i<num; i++) {
            if (num % i == 0) {
                System.out.println("Nao e um numero primo - Divisivel por " + i);
                primo = false;
            }
        }
        if(primo){
            System.out.println("E numero primo");
        }
    }
}
