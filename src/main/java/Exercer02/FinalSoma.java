/*Exer 17.11.Altere o programa anterior para mostrar no final a soma dos
números.
 */
package Exercer02;

import java.util.Scanner;

public class FinalSoma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int num1 = scan.nextInt();
        System.out.println("Digite o segundo numero: ");
        int num2 = scan.nextInt();

        int soma = 0;

        for (int i=num1; i<=num2; i++) {
            soma += i;

        }
        System.out.println("Soma: " +soma);
    }
}
