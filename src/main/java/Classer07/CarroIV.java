//Al31 :: Modificadores private e public.
package Classer07;

public class CarroIV {
    public String marca; // public geral p/quem quiser ver.
    String modelo;
    int numPassageiros;
    double capCombustivel;
    private double consumoCombustivel;// private somente dentro da propria classe

    public void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " +this.capCombustivel * this.consumoCombustivel);
    }
    public double obterAutonomia() {
        System.out.println("Metodos obterAutonomia foi chamado. ");

        return this.capCombustivel * this.consumoCombustivel;
    }
    private double divideKMPorComsumoCombustive(double km) {
        return km/this.consumoCombustivel;
    }
    public double calcularCOmbustivel(double km) {
        return this.divideKMPorComsumoCombustive(km);

    }
}



