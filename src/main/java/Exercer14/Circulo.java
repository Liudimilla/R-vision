// Exer.:44.1*
package Exercer14;

public class Circulo extends Figura2D {

    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return (raio * raio) * Math.PI;
        // Opçao 2; return raio * raio * 3.14;
    }
}


