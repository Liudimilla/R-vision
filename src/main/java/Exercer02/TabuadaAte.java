/* Questao 17.30::.Desenvolva um programa que faça a tabuada de um número qualquer inteiro que será digitado pelo
usuário, mas a tabuada não deve necessariamente iniciar em 1 e terminar em 10, o valor inicial e final
devem ser informados também pelo usuário, conforme exemplo abaixo: o Montar a tabuada de: 5
o Começar por: 4 o Terminar em: 7 o o Vou montar a tabuada de 5 começando em 4 e terminando em 7:
o 5 X 4 = 20 o 5 X 5 = 25 o 5 X 6 = 30 o 5 X 7 = 35 Obs: Você deve verificar se o usuário não digitou o
final menor que o inicial. */
package Exercer02;

import java.util.Scanner;

public class TabuadaAte {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o numero para gerar a tabuada: ");
        int num = scan.nextInt();

        boolean invalido = true;
        int fim,ini;
        do {
            System.out.println("Entre com o inicio a tabuada: ");
           ini = scan.nextInt();
            System.out.println("Entre com o final tabuada: ");
            fim = scan.nextInt();

            if (fim > ini) {
                invalido = false;
            }
        } while (invalido);

        System.out.println("TabuadaAte de "+num+":");
        System.out.println("Comecar por "+ini+":");
        System.out.println("Terminar em "+fim+":");
        System.out.println();

        for(int i=ini; i<fim; i++) {
            System.out.println(num+ "X" +i+ "="+(num*i));
        }
    }
}
