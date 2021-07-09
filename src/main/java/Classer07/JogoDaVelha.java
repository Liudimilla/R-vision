package Classer07;

public class JogoDaVelha {
    char[][] jogovelha;
    int jogoda;

    public JogoDaVelha() {
        jogovelha = new char[3][3];
        jogoda = 1;
    }

        boolean validarJogada(int linha, int coluna, char sinal) {
            if (jogovelha[linha][coluna] == sinal || jogovelha[linha][coluna] == '0');
            return false;

        }
    }

