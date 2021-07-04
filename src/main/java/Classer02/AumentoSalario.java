/*Questao 15.11;As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e
lhe contraram para desenvolver o programa que calculará os reajustes. o Faça um programa que
recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário
 atual: o salários até R$ 280,00 (incluindo) : aumento de 20% o salários entre R$ 280,00 e R$ 700,00 :
 aumento de 15% o salários entre R$ 700,00 e R$ 1500,00 : aumento de 10% o salários de R$ 1500,00 em diante :
 aumento de 5% Após o aumento ser realizado, informe na tela: o o salário antes do reajuste; o percentual de
 aumento aplicado; o valor do aumento; o o novo salário, após o aumento.
*/
package Classer02;

import java.util.Scanner;

public class AumentoSalario {
 public static double calculoPorcetagem (double salario,double porcetagem){
     return salario * porcetagem;


 }
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        double nov = 0 , at =0 ,am = 0;
        System.out.println("Informe o salario 1 para(280,00 e R$ 700,00), 2 para( R$ 1500,00),3 para (1500,00 em diante): ");
        double salarioAtual = scan.nextDouble();

        if (salarioAtual >= 280.00)  {
            nov = calculoPorcetagem(salarioAtual,0.20);
            at = salarioAtual + nov;

        } if (salarioAtual >= 700.00)  {
            nov = calculoPorcetagem(salarioAtual,0.15);
            at = salarioAtual + nov;

        }else if (salarioAtual >= 1500.00) {
            nov = calculoPorcetagem(salarioAtual,0.10);
            at = salarioAtual + nov;

        } else if (salarioAtual >= 1500.01) {
            nov = calculoPorcetagem(salarioAtual,0.05);
            at = salarioAtual + nov;


        }

        System.out.println("Valor do salário antes do reajuste R$ " + salarioAtual);
        System.out.println("o valor do aumento: " + nov);
        System.out.println("o novo salário após o aumento: " + at);

    }
}
