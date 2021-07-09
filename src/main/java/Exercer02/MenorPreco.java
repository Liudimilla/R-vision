/*Questao 14.8; Faça um programa que pergunte o preço de três produtos e informe qual
 produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.
 */
package Exercer02;

import java.util.Scanner;

public class MenorPreco {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                System.out.println("Digite um o primeiro preço: ");
                double preco1 = scan.nextDouble();
                System.out.println("Digite um o segundo preço: ");
                double preco2 = scan.nextDouble();
                System.out.println("Digite um o terceiro preço: ");
                double preco3 = scan.nextDouble();

                if (preco1 <= preco2 && preco1 <= preco3) {
                        System.out.println("O Compre o produto 1");
                }
                if (preco2 <= preco1 && preco2 <= preco3) {
                        System.out.println("O Compre o produto 2");
                }
                if (preco3 <= preco1 && preco3 <= preco2) {
                        System.out.println("O Compre o produto 3");
                }
        }
}
