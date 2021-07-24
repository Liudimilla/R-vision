/* Q 17.12::.Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo: o Tabuada de 5: o 5 X 1 = 5 o 5 X 2 = 10 o ... o 5 X 10 = 50
 */
package Exercer02;

import java.util.Scanner;

public class GeradorTabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite numero que deseja ver na tabuada: ");
        int num1 = scan.nextInt();

        System.out.println("Tabuada de " +num1+ ":");


        for (int i=0; i<=10; i++) {
            System.out.println(num1 + "X"+ i + "=" + (num1*i));
        }

    }
}
