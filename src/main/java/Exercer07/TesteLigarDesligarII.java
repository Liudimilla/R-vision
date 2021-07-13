//Questao Al28°33.1;
package Exercer07;

import Exercer05.Lampada;

public class TesteLigarDesligarII {
    public static void main(String[] args) {
        LigarDesligarII ligarDesligarII = new LigarDesligarII();
        ligarDesligarII.ligar();
        ligarDesligarII.mostrarEstado();
        ligarDesligarII.desligar();
        ligarDesligarII.mostrarEstado();
        ligarDesligarII.mudarEstado();
        ligarDesligarII.mostrarEstado();

    }
}
