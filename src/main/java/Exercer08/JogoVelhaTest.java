// Exerc 27.4.::
package Exercer08;


import java.util.Scanner;

public class JogoVelhaTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        JogoVelha jogoVelha = new JogoVelha();

        System.out.println("Jogodor 1 = X");
        System.out.println("Jogodor 2 = O");

        boolean ganhou = false;
        char sinal;
        int linha = 0, coluna = 0;

        while (!ganhou) {
            if (jogoVelha.vezJogador1()) {
                System.out.println("Vez do jogador 1. Escolha linha e coluna");
                sinal = 'X';
            } else {
                System.out.println("Vez do jogador 2. Escolha linha e coluna");
                sinal = 'O';
            }
            linha = valor("Linha", scan);
            coluna = valor("Coluna", scan);

            if (!jogoVelha.validarJogada(linha, coluna, sinal)) {
                System.out.println("Posiçao ja usada, tente novamente ");
            }
            jogoVelha.imprimirTabuleiro();

            if (jogoVelha.verificarGanhador('X')) {
                ganhou = true;
                System.out.println("Parabens, jogador 1 ganhou! ");
            } else if (jogoVelha.verificarGanhador('O')) {
                ganhou = true;
                System.out.println("Parabens, jogador 2 ganhou! ");

            } else if (jogoVelha.jogada() > 9) {
                ganhou = true;
                System.out.println("Ninguem ganhou essa partida. ");
            }
        }
    }
    static int valor (String tipoValor, Scanner scan){
        int valor = 0;
        boolean valorValida = false;
        while (!valorValida) {
            System.out.println("Entre com a " + tipoValor + "(1, 2 ou 3 )");
            valor = scan.nextInt();
            if (valor >= 1 && valor <= 3) {
                valorValida = true;
            } else {
                System.out.println("Entrada invalida, tente novamente");
            }
        }
        valor--;
        return valor;
    }
}
