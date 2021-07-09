package Classer07;

public class CarroII {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    public CarroII(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {

    this.marca = marca;
    this.modelo = modelo;
    this.numPassageiros = numPassageiros;
    this.capCombustivel = capCombustivel;
    this.consumoCombustivel = consumoCombustivel;
}
public CarroII() { }
public CarroII(String marca, String modelo, int numPassageiros) {
    this.marca = marca;
    this.modelo = modelo;
    this.numPassageiros = numPassageiros;
    System.out.println("Chamando o construtor com 3 parametros ");
}
    public CarroII(String marca, String modelo) {
        this(marca,modelo,10);
        System.out.println("Chamando o construtor com 2 parametros ");
    }

    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " +this.capCombustivel * this.consumoCombustivel);
    }
    double obterAutonomia() {
        System.out.println("Metodos obterAutonomia foi chamado. ");

        return this.capCombustivel * this.consumoCombustivel;
    }
    double calcularCOmbustivel(double km) {
    double qtdCombustivel = km/this.consumoCombustivel;

    return qtdCombustivel;

}
}
