/* Questao 17.33::.Faça um programa que mostre os n termos da Série a seguir: o S =
 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m. Imprima no final a soma da série. */
package Exercer02;

import java.util.Scanner;

public class SomaSerie {
    public static void main(String[] args) {
        Scanner milla = new Scanner(System.in);

        System.out.println("Digite o valor de n");
        int n = milla.nextInt();
        double soma = 0;

        for (int i=1, j=1;i<=n; i++, j+=2) {
            System.out.print(i + "/" +j+ " + ");

            soma += i/j;
        }
        System.out.println("\nSoma = "+soma);
    }
}
