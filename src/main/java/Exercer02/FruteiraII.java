/*Questao 16.22.1; Uma fruteira está vendendo frutas com a seguinte tabela de preços
: Até 5 Kg Acima de 5 Kg Morango R$ 2,50 por Kg R$ 2,20, por Kg Maçã R$ 1,80 por Kg
R$ 1,50 por Kg, por Kg pera  R$ 3,50 por Kg R$ 2,90. Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra
ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total, se comprar mais 10 Kg e o valor
ultrapassar R$30 recebera 15% de desconto. Escreva um
algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas
 e escreva o valor a ser pago pelo cliente.
 */
package Exercer02;

import java.util.Scanner;

public class FruteiraII<pcTtal> {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a quantidade (Kg) de morango: ");
        double qtdMo = scan.nextDouble();

        System.out.println("Entre com a quantidade (Kg) de maça: ");
        double qtdMa = scan.nextDouble();

        System.out.println("Entre com a quantidade (Kg) de pera: ");
        double qtdPe = scan.nextDouble();


        double pcKgMo = 0;
        if (qtdMo <= 5) {
            pcKgMo = 2.5;
        } else {
            pcKgMo = 2.2;
        }
        double pcKgMa = 0;
        if (qtdMa <= 5) {
            pcKgMa = 1.8;
        } else {
            pcKgMa = 1.5;

        }
       double pcKgPe = 0;
        if (qtdPe <= 5) {
            pcKgPe = 3.50;
        } else {
           pcKgPe = 2.90;
        }


        double pcTotMog = qtdMo * pcKgMo;
        double pcToMa = qtdMa * pcKgMa;
        double pcTpe = qtdPe * pcKgPe;

        double pcTtalPa = pcKgMo + pcKgMa; //+ pcKgPe;
        double pcTtal = pcTtalPa;

        if ((qtdMo + qtdMa  <= 8) || pcTtalPa <= 25) {
            pcTtal = pcTtalPa - ((pcTtalPa / 100) * 10);

        }
         else if ((qtdMo + qtdMa + qtdPe >= 10) || pcTtalPa >= 30) {
            pcTtal = pcTtalPa - ((pcTtalPa / 100) * 15);

       }
        System.out.println("Preço total = " + pcTtal);
    }

}



