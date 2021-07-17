package Exercer05;

public class SupermecadoLampada {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.modelo = "A60";
        lampada.tensao = "Bivolt";
        lampada.cor = " Amarela";
        lampada.tipoLuz = "Branca";
        lampada.tipoAbajur =true;
        lampada.garantiaMeses = 36;
        lampada.potencia = 7;

        lampada.tipos = new String[5];
        lampada.tipos[0] = "Abajur";
        lampada.tipos[1] = "Lampeoes";



    }
}
