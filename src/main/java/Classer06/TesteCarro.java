package Classer06;

public class TesteCarro {
    public static void main(String[] args) {

        Carros van = new Carros();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPasseiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        Carros fusca = new Carros();
        fusca.marca = "Volkswagem";
        fusca.modelo = "Fusca";
        fusca.numPasseiros = 4;
        fusca.capCombustivel = 30;
        fusca.consumoCombustivel = 0.15;

        System.out.println(fusca.marca);
        System.out.println(fusca.modelo);

        Carros gol = new Carros();
        gol.marca = "Volkswagem";
        gol.modelo = "Gol";
        gol.numPasseiros = 4;
        gol.capCombustivel = 25;
        gol.consumoCombustivel = 0.12;

        System.out.println(gol.marca);
        System.out.println(gol.modelo);

    }
}
