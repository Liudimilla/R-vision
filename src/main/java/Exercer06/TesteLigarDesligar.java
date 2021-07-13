package Exercer06;

import Exercer07.LigarDesligarII;

public class TesteLigarDesligar {
    public static void main(String[] args) {
        LigarDesligar ligarDesligar = new LigarDesligar();
        ligarDesligar.ligar();
        ligarDesligar.mostrarEstado();
        ligarDesligar.desligar();
        ligarDesligar.mostrarEstado();
        ligarDesligar.mudarEstado();
        ligarDesligar.mostrarEstado();
    }
}
