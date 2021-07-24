/* Q17.13::. Faça um programa que peça 10 números inteiros, calcule e mostre
 a quantidade de números pares e a quantidade de números impares.
 */
package Exercer02;

import java.util.Scanner;

public class SomaParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pares = 0;
        int impares = 0;
        int num;

        for (int i = 0; i < 10; i++) {

            System.out.println("Entre com um numero: ");
            num = scan.nextInt();

            if (num % 2 == 0) {
                pares++;

            } else {
                impares++;
            }
        }
        System.out.println("Pares: " + pares);
        System.out.println("Pares: " + impares);
    }
}
