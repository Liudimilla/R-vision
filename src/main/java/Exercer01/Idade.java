package Exercer01;

import java.util.Scanner;

public class Idade {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            System.out.println("Digite sua idade em anos: ");
            int idade = scan.nextInt();

            System.out.println("Idade em meses: ");
            System.out.println(multiplicar(idade, 12));

            System.out.println("Idade em dias: ");
            System.out.println(multiplicar(idade, 365));

            System.out.println("Ano de Nascimento: " + (idade - 2021));


        }

    private static int multiplicar(int idade, int i) {
        return idade * i;
    }
}

