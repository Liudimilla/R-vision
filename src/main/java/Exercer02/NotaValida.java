package Exercer02;

import java.util.Scanner;

/* Questao 17.1; Faça um programa que peça u,a nota, entre 0 e dez. Mostre uma mensagem
caso o valor seja invalido e continue pedindo ate que o usuario informe um valor valido.
 */
public class NotaValida {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean notaValida = false;
        do {
            System.out.println("Entre com uma nota");
            double nota = scan.nextDouble();
            if (nota >= 0 && nota <= 10) {
             notaValida = true;
                System.out.println("Voce digitou: " + nota);
            } else {
                //notaValida = false;
                System.out.println("Nota invalida, digite novamente.");
            }

        } while (!notaValida);
    }
}

