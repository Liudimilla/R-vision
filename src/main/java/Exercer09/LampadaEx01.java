package Exercer09;

public class LampadaEx01 {
    public static void main(String[] args) {

        LampadaI lampada = new LampadaI();
        lampada.ligar();
        lampada.mostrarEstado();
        lampada.desligar();
        lampada.mostrarEstado();
        lampada.mudarEstado();

    }
}
