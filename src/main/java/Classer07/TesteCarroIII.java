package Classer07;

import Classer06.Carros;

public class TesteCarroIII {
    public static void main(String[] args) {

        CarroIII van = new CarroIII();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        //van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.numPassageiros);
        System.out.println(van.modelo);

        CarroIII fusca = new CarroIII("Volkswagem", "Picape",10,100,0.2);


        System.out.println(fusca.marca);
        System.out.println(fusca.modelo);
        System.out.println(fusca.numPassageiros);
        System.out.println(fusca.capCombustivel);
        System.out.println(fusca.consumoCombustivel);

        CarroIII gol = new CarroIII();
        gol.marca = "Volkswagem";
        gol.modelo = "Gol";
        gol.numPassageiros = 4;
        gol.capCombustivel = 25;
        gol.consumoCombustivel = 0.12;

        System.out.println(gol.marca);
        System.out.println(gol.modelo);
CarroIII1 carroIII1 = new CarroIII1();
    }
}
