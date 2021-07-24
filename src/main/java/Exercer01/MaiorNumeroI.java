/*  Questao 14.7::. Faça um Programa que leia três números e mostre o maior e o menor deles.
*/
package Exercer01;


import java.util.Scanner;

public class MaiorNumeroI {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Digite um o primeiro numero: ");
            int num1 = scan.nextInt();
            System.out.println("Digite um o segundo numero: ");
            int num2 = scan.nextInt();

            if (num1>num2) {
                System.out.println("O Numero maior e : "+num1);
                System.out.println("O Numero menor e : "+num2);
            }
            else {
                System.out.println("O Numero maior e : "+num2);
                System.out.println("O Numero menor e : "+num1);
            }
        }
    }
