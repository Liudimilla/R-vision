/*Questao 31.4. Reescreva  o  exercício  6  da  aula  20  (Jogo  da  Velha).  Desenvolva
 uma  classe   para  representar  o  Jogo  da  Velha.  Desenvolva  uma  classe  para  testar
  o   Jogo.

package Exercer07;

import java.util.Scanner;

public class JogoVelhaIII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        JogoVelhaIII jogoVelhaIII = new JogoVelhaIII();
        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = 0");

        boolean ganhou = false;
        char sinal;
        int linha = 0, coluna = 0;

        while (!ganhou) {
            if (jogoVelhaIII.vezJogador()) {
                System.out.println("Vez do jogador 1.Escolha linha e o sinal: sinal = ");

            } else {
                System.out.println("Vez do jogador 1.Escolha linha e o sinal: sinal");
            }
            linha = valor("Linha", scan);
            coluna = valor("Coluna", scan);

            if(JogoVelhaIII.validarJogada(linha, coluna, sinal)) {
                System.out.println("Posiçao ja usada, tente novamente");
            }
            jogoVelhaIII.imprimirTabuleiro();

            if(jogoVelhaIII.verificarGanhador('V')) {
                ganhou = true;
                System.out.println("Parabens, jogador 1 ganhou! ");
            } else if (jogoVelhaIII.verificarGanhador('0')) {
                ganhou = true;
                System.out.println("Parabens, jogador 2 ganhou!");
            } else if (jogoVelhaIII.getJogado() > 9) {
                ganhou = true;
                System.out.println("Ninguem ganhou a partida.");
            }
        }
    }
    static int valor(String tipoValor, Scanner scan) {
        int valor = 0;
        boolean valorValida = false;
        while (!valorValida) {
            System.out.println("Entre com a "+tipoValor+(1,2));
            valor = scan.nextInt();
            if(valor >= 1 && valor <= 3) {
                valorValida = true;
            } else {
                System.out.println("Entrada Invalida, tente novamente");
            }
        }
        valor --;
        return valor;
    }
}
*/