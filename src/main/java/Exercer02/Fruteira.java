/*Questao 16.22; Uma fruteira está vendendo frutas com a seguinte tabela de preços
: Até 5 Kg Acima de 5 Kg Morango R$ 2,50 por Kg R$ 2,20 por Kg Maçã R$ 1,80 por Kg
R$ 1,50 por Kg Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra
ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total. Escreva um
algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas
 e escreva o valor a ser pago pelo cliente.
 */
package Exercer02;

import java.util.Scanner;

public class Fruteira {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantidade (em Kg) de morangos: ");
        float kg1 = scan.nextFloat();
        System.out.println("Quantidade (em Kg) de maças: ");
        float kg2 = scan.nextFloat();

        if (kg1 == 5 && kg1 >= 5);
        {
            System.out.println(" O valor da Morango R$ 2,50 por Kg R$ 2,20");
        }
           if (kg2 == 5 && kg2 >= 5);
            {
                System.out.println("O valor da Maça R$ 1,80 por Kg R$ 1,50");
            }
            float kilos = kg1+kg2;
            float valor = 0;

            if(kilos >= 8 || valor >= 25.00); {
            System.out.println(" Voce recebera 10% de desconto: ");
        }
        }
    }

