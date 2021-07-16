/*Questao 16.23;O Hipermercado Tabajara está com uma promoção de carnes que é
imperdível. Confira: o Até 5 Kg Acima de 5 Kg o File Duplo R$ 4,90 por Kg R$ 5,80 por Kg
o Alcatra R$ 5,90 por Kg R$ 6,80 por Kg o Picanha R$ 6,90 por Kg R$ 7,80 por Kg Para atender
a todos os clientes, cada cliente poderá levar apenas um dos tipos de carne da promoção,
porém não há limites para a quantidade de carne por cliente. Se compra for feita no cartão
 Tabajara o cliente receberá ainda um desconto de 5% sobre o total a compra.
 Escreva um programa que peça o tipo e a quantidade de carne comprada pelo usuário e gere
  um cupom fiscal, contendo as informações da compra: tipo e quantidade de carne, preço total,
tipo de pagamento, valor do desconto e valor a pagar. */
package Exercer02;

import java.util.Scanner;

public class PromocaoDeCarnes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual tipo de carne voce deseja comprar: \n\t1-File;\n\t2-Alcantra;\n\t3-picanha");
        int carne = scan.nextInt();
        System.out.println("Quantos kilo de carne voce deseja comprar: ");
        float kilo = scan.nextInt();
        System.out.println("Forma de pagamento: 1-Vista; 2-Cartao ");
        int pag = scan.nextInt();

        double precKil = 0;
        if (carne == 1 && 5 < kilo) {
            precKil = 4.90;
            System.out.println(+kilo + "Kg - file");

        } else {
            precKil = 5.80;
            System.out.println(+kilo + "Kg - file");
        }
        if (carne == 2 && 5 < kilo) {
            precKil = 5.90;
            System.out.println(+kilo + "Kg - alcantra");
        } else {
            precKil = 6.80;
            System.out.println(+kilo + "Kg - alcantra");
        }
        if (carne == 3 && 5 < kilo) {
            precKil = 6.90;
            System.out.println(+kilo + "Kg - picanha");
        } else {
            precKil = 7.80;
            System.out.println(+kilo + "Kg - picanha");
        }

        double total = kilo * precKil;
        System.out.println("Quantidade de carne: " + kilo + "Kilo");
        System.out.println("Tipo de pagamento: " + pag);
        System.out.println("valor do desconto: ");
        System.out.println("valor a pagar: " + kilo + "Kg" + precKil + " " + total);


        if (pag == 1) {
            double desconto = (total / 100) * 5;
            System.out.println("Desconto de:" + desconto);
            System.out.println("Valor a pagar:" + (desconto - total));
        } else {
            System.out.println("Valor a pagar:" + total);
        }
    }
}