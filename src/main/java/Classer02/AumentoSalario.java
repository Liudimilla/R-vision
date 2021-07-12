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
    public static double calculoPorcetagem(double salario, double porcetagem) {
        return salario * porcetagem;


    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nov = 0, at = 0, am = 0;
        System.out.println("Informe o salario 1 para(280,00 e R$ 700,00), 2 para( R$ 1500,00),3 para (1500,00 em diante): ");
        double salarioAtual = scan.nextDouble();

        int percentual = 0;
        if (salarioAtual <= 280) {
            percentual = 20;
        } else if (salarioAtual > 280 && salarioAtual < 700) {
            percentual = 15;
        } else if (salarioAtual > 700 && salarioAtual < 1500) {
            percentual = 10;
        } else if (salarioAtual >= 1500) {
            percentual = 5;
        }
        double aumento = (salarioAtual / 100) * percentual;
        double salarioAjusto = salarioAtual + aumento;


            System.out.println("Salario: " + salarioAtual);
            System.out.println("Percentual: " + percentual);
            System.out.println("Aumento: " + aumento);
            System.out.println("o novo salário após o aumento: " + salarioAjusto);

        }
    }

