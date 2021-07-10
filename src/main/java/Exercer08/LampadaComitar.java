package Exercer08;

public class LampadaComitar {
    public static void main(String[]args) {

        Lampada lampada = new Lampada();
        lampada.ligar();
        lampada.mostrarEstado();
        lampada.mudarEstado();
        lampada.desligar();

        if (lampada.ligado) {
            System.out.println("Lampada esta ligada");
        } else {
            System.out.println("Lampada esta desligada");
        }
}
}