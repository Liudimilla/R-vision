/* Questao CC2019; Faca um programa que solicite que o usuario digite
o salario, o desconto medico, comissao de venda e resjuste salarial
e programa calcule o salario final do funcionario
 */
package Exercer01;

import java.util.Scanner;

public class AjusteSalarial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o salário atual: ");
        double salarioAtual = scan.nextDouble();

        System.out.println("Digite o valor do desconto medico");
        double descentMedico = scan.nextDouble();

        System.out.println("Digite sua comissa de vendas: ");
        double comVenda = scan.nextDouble();

        System.out.println("Digite o percentual de reajuste: ");
        double percentualDeReajuste = scan.nextDouble();

        double reajuste = salarioAtual * percentualDeReajuste;
        double salfinal = reajuste + salarioAtual + comVenda - descentMedico;


        System.out.println("Valor de Reajuste R$ " + reajuste );
        System.out.println("Salário com Reajuste R$ " + (salarioAtual + reajuste ));
        System.out.println("Salario Final: " + salfinal);


    }
}
