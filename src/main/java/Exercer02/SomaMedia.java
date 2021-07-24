/*Questao 15.8;Faça um programa que leia 5 números e informe a soma e a média dos números.
 */
package Exercer02;

import java.util.Scanner;

public class SomaMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double media;
        int num;
        int soma = 0;
                
                for (int i=0; i<5; i++) {

                    System.out.println("Digite um numero ");
                    num = scan.nextInt();
        /* Opçao 2
        System.out.println("Digite hm numero ");
        int num1 = scan.nextInt();

        System.out.println("Digite hm numero ");
        int num2 = scan.nextInt();

        System.out.println("Digite um numero ");
        int num3 = scan.nextInt();

        System.out.println("Digite hm numero ");
        int num4 = scan.nextInt();

        System.out.println("Digite hm numero ");
        int num5 = scan.nextInt();

        int soma = num1 + num2 + num3 + num4 + num5;
        media = soma/5;
*/
        soma += num;
    }
    media = soma /5;
        System.out.println("a soma dos numeros; " +soma);
        System.out.println("a soma dos numeros; " +media);
    }
}
