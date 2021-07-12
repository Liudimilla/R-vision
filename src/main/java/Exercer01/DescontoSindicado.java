/*Questao 12;Faça um Programa que pergunte quanto você ganha por hora e o número de horas
trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que
são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um
programa que nos dê: . salário bruto. a. quanto pagou ao INSS. b. quanto pagou ao sindicato.
c. o salário líquido. d. calcule os descontos e o salário líquido, conforme a tabela abaixo:
+ Salário Bruto : R$ - IR (11%) : R$ - INSS (8%) : R$ - Sindicato ( 5%) : R$ = Salário Liquido : R$
2.     Obs.: Salário Bruto - Descontos = Salário Líquido. */
package Exercer01;

import java.util.Scanner;

public class DescontoSindicado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quanto voce ganha por hora: ");
        double sal = scan.nextDouble();

        System.out.println("Quantas horas voce trabalhou no mes: ");
        double hor = scan.nextDouble();

        double salB = sal * hor;
        double inss = (salB /100) * 8;
        double sind = (salB /100) * 5;
        double ir = salB /100 * 11;
        double tDesc = inss + sind + ir;
        double salL = salB - tDesc;

        System.out.println("Salário bruto: "+salB);
        System.out.println("Quanto pagou ao INSS: "+inss);
        System.out.println("Quanto pagou ao sindicato: "+sind);
        System.out.println("O salário líquido: "+ir);
        System.out.println("Total de desconto: "+tDesc);
        System.out.println("O salário líquido: " +salL);
    }
}
