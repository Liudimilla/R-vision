/*Questao 17.18.Faça um programa que peça um número inteiro e determine se ele é ou não um
 número primo. Um número primo é aquele que é divisível somente por ele mesmo e por 1.
 */
package Exercer02;

import java.util.Scanner;

public class NumPrimo {
    public static void main(String[] args) {
        Scanner milla = new Scanner(System.in);

        System.out.println("Digite um numero");
        int num = milla.nextInt();

        boolean primo = true;
        for (int i=2; i<num; i++) {
            if (num % i == 0) {
                System.out.println("Nao e primo - divisivel por "+i);
                primo = false;
                //break;
            }
        }
if (primo) {
    System.out.println("E numero primo");
}
    }
}
