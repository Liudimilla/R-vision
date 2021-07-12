/*Questao 16.18; Faça um Programa que peça um número inteiro e determine se ele é
 par ou impar. Dica: utilize o operador módulo (resto da divisão).
 */
package Exercer02;

import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o ano: ");
        int ano = scan.nextInt();

        if ((ano % 400 == 0 ) || (ano % 4 == 0 && ano % 100 != 0)) {
            System.out.println("é bissexto");
        } else {
            System.out.println("nao e bissexto");
        }
    }
}
