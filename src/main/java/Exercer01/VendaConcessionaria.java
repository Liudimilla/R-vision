package Exercer01;
// Questao CC2019; Faça um programa que realize o calculo do salario final de uma
// funcionario apois o comissao de venda
import java.util.Scanner;

public class VendaConcessionaria {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o numero de carros vendidos: ");
        double totalCarrosVendidos = scan.nextDouble();

        System.out.println("Digite a comissao fixa por cada carro vendido: ");
        double comissaoFixa = scan.nextDouble();

        System.out.println("Digite o valor total de vendas R$: ");
        double valortotaldeVendas = scan.nextDouble();

        System.out.println("Digite o valor da venda %: ");
        double percentualVenda = scan.nextDouble();

        System.out.println("Digite o salario fixo R$: ");
        double salarioFixo = scan.nextDouble();


        System.out.println("Salário final do vendedor R$ " +
                (multiplicacao(comissaoFixa, totalCarrosVendidos) +
                        multiplicacao(valortotaldeVendas, percentualVenda) +
                        salarioFixo));
       // System.out.println("Salário final do vendedor R$ " + salarioFixoDes);
    }

    private static double multiplicacao(double x, double y) {
            return x * y;
        }
    }



