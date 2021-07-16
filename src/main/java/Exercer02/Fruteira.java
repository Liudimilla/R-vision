/*Questao 16.22; Uma fruteira está vendendo frutas com a seguinte tabela de preços
: Até 5 Kg Acima de 5 Kg Morango R$ 2,50 por Kg R$ 2,20 por Kg Maçã R$ 1,80 por Kg
R$ 1,50 por Kg . Escreva umalgoritmo para ler a quantidade (em Kg) de morangos e a
quantidade (em Kg) de maças adquiridas
 e escreva o valor a ser pago pelo cliente.
 */
package Exercer02;

import java.util.Scanner;

public class Fruteira {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual fruta voce deseja comprar: MA = Maça OU MO = Morango");
        String frut = scan.next();
        System.out.println("Quantos Kilos voce deseja: ");
        double kg = scan.nextFloat();

        float pMorang = 2.20f;
        float pMoran = 2.50f;
        float pMacas = 1.80f;
        float pMaca = 1.50f;
        int percDesconto = 0;
        float total = 0;
        float totalDesc = 0;
        float a = 0;


        if (frut.equalsIgnoreCase("ma")) {

            if (kg >= 5) {
                a = (float) (kg * pMaca);
            } else {
                a = (float) (kg * pMacas);
            }
            System.out.println("Fruta escolhida Maças: ");

        } else if (frut.equalsIgnoreCase("mo")) {
            if (kg >= 5) {
                a = (float) (kg * pMorang);
            } else {
                a = (float) (kg * pMoran);

            }

        }
        System.out.println("Fruta escolhida Morango: ");


        System.out.println("Quantidade frutas : " + kg + ": Kilos");

        System.out.println("O valor a ser pago : " + a);


    }
}

