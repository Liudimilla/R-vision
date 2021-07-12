/*Questao 16.21; Um posto está vendendo combustíveis com a seguinte tabela de descontos:
 . Álcool: a. até 20 litros, desconto de 3% por litro b. acima de 20 litros, desconto de
 5% por litro Gasolina: c. até 20 litros, desconto de 4% por litro
 d. acima de 20 litros, desconto de 6% por litro Escreva um algoritmo que leia o número de
 litros vendidos, o tipo de combustível (codificado da seguinte forma:
 A-álcool, G- gasolina), calcule e imprima o valor a ser pago pelo cliente
sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço do litro do álcool é R$ 1,90.
*/
package Exercer02;

import java.util.Scanner;

public class TabelaDesconto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o tipo de combustivel: A- Alcool B- Gasolina: ");
        String comb = scan.next();
        System.out.println("Quantos litros de gasolina: ");
        int lit = scan.nextInt();

        float pGas = 2.5f;
        float pAcol = 1.9f;
        int percDesconto = 0;
        float total = 0;
        float totalDesc= 0;

        if (comb.equalsIgnoreCase("a")) {
            if (lit <= 20) {
                percDesconto = 3;
            } else {
                percDesconto = 5;
            }
            total = lit * pAcol;

        } else if (comb.equalsIgnoreCase("g")) {
            if (lit <= 20) {
                percDesconto = 4;
            } else {
                percDesconto = 6;
            }
            total = lit * pGas;
        }
        totalDesc = (total/100) * percDesconto;
        float precoApagar = total - totalDesc;

        System.out.println("Valor a ser pago: " +precoApagar);
    }
}
