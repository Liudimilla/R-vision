/* Q17.9::. Faça um programa que imprima na tela apenas os números ímpares
 entre 1 e 50.
 */
package Exercer02;

import java.util.Scanner;

public class Impares {
    public static void main(String[] args) {
        //Scanner sca = new Scanner(System.in);

        for (int i = 0; i <= 50; i++) {
            if (i % 2 != 0) {

                System.out.println(i);
            }
        }
    }
}