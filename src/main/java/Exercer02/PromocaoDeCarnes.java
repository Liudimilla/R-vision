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

        System.out.println("Qual tipo de carne voce deseja comprar: ");
        String carne = scan.next();
        System.out.println("Quantos kilo de carne voce deseja comprar: ");
        float kilo = scan.nextInt();
        System.out.println("Forma de pagamento: 1-Vista; 2-Cartao ");
        int pag = scan.nextInt();

        String file = null, alcatra = null, picanha = null;


        if (carne == file && 5 >= kilo);
        {
            System.out.println("Preço total: ");
        }
        if (carne == alcatra && 5 >= kilo) ;
        {
            System.out.println("Preço total: ");
        }
        if (carne == picanha && 5 >= kilo) ;
        {
            System.out.println("Preço total: ");
        }
        System.out.println("Tipo: " + carne);
        System.out.println("Quantidade de carne: "+ kilo +"Kilo");
        System.out.println("Tipo de pagamento: "+ pag);
        System.out.println("valor do desconto: ");
        System.out.println("valor a pagar: ");
    }
}
