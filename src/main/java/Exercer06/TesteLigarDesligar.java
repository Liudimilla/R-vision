package Exercer06;

import Exercer07.LigarDesligarII;

public class TesteLigarDesligar {
    public static void main(String[] args) {
        /*LigarDesligar ligarDesligar = new LigarDesligar();
        ligarDesligar.ligar();
        ligarDesligar.mostrarEstado();
        ligarDesligar.desligar();
        ligarDesligar.mostrarEstado();
        ligarDesligar.mudarEstado();
        ligarDesligar.mostrarEstado();

         */
        LigarDesligar lampada = new LigarDesligar();
       lampada.modelo = "A60";
       lampada.tensao = "Bivolt";
       lampada.garantiaMeses = 36;
       lampada.potencia = 7;
       lampada.cor = "Amarelo";
       lampada.tipoLuz = "Amarelo";
       lampada.tipoAbajur = true;

       lampada.tipos = new String[5];
       lampada.tipos[0] = "Abajur";
       lampada.tipos[1] = "Lampeoes";
    }
}
