/*Questao 15.12;Faça um programa para o cálculo de uma folha de pagamento, sabendo que os
descontos são do Imposto de Renda, que depende do 2.salário bruto (conforme tabela abaixo)
e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado
 (é a empresa que deposita). O Salário Líquido corresponde ao Salário Bruto menos os descontos.
  O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
   o Desconto do IR: o Salário Bruto até 900 (inclusive) - isento o Salário Bruto até 1500 (inclusive)
   - desconto de 5% o Salário Bruto até 2500 (inclusive) - desconto de 10% o Salário Bruto acima de 2500
   - desconto de 20% Imprima na tela as informações, dispostas conforme o exemplo abaixo. No exemplo
   o valor da hora é 5 e a quantidade de hora é 220.
     Salário Bruto: (5 * 220) : R$ 1100,00 (-) IR (5%)
    : R$ 55,00 (-) INSS ( 10%) : R$ 110,00 FGTS (11%) :
     R$ 121,00 Total de descontos : R$ 165,00
    Salário Liquido : R$ 935,00
 */
package Classer02;

import java.util.Scanner;

public class DescontoImposto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double ir = 0, inss = 0,fgts = 0;
        double desc = 0;
        double sll = 0;

        System.out.println("o valor da sua hora de trabalho: ");
        double hora = scan.nextDouble();
        System.out.println("Quantas horas de trabalho no mes: ");
        double hm = scan.nextDouble();
        double sl = hora * hm;


        if (sl == 900.00)  {
            System.out.println("Isento");

        }
        if (sl > 900.00 && sl <= 1500)  {
            ir = (sl /100) * 5;
            inss = (sl /100) * 10;
            fgts = (sl /100) * 11;
            desc = ir + inss+ fgts;
            sll = sl - desc;
        }
        if (sl > 1500 && sl >= 2500.00)
        {
            ir = (sl /100) * 5;
            inss = (sl /100) * 10;
            fgts = (sl /100) * 11;
            desc = ir+inss+fgts;
            sll = sl - desc;
        }
        if (sl > 2500.00) {
            ir = (sl /100) * 5;
            inss = (sl /100) * 10;
            fgts = (sl /100) * 11;
            desc = ir+inss+fgts;
            sll = sl - desc;
        }
/*
   
 */
        System.out.println("Salario bruto: " +sl);
        System.out.println("Total de descontos: " +desc);
        System.out.println("(-): IR: " +ir);
        System.out.println("(-): INSS: " +inss);
        System.out.println("(-): FGTS: " +fgts);
        System.out.println("Salário Líquido: " + sll);
    }
}

