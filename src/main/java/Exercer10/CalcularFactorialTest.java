package Exercer10;

import java.util.Scanner;

public class CalcularFactorialTest {
    public static void main(String[] args) {
        Scanner milla = new Scanner(System.in);
        int num;
        do {
            System.out.println("Entre com um numero positivo");
            num = milla.nextInt();

            if (num < 0) {
                System.out.println("Numero invalido, entre novamente ");
            }
        } while (num < 0);
        System.out.println(CalcularFactorial.fatorial(num));
    }
}
