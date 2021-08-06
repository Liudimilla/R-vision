// Exer.:44.1*
package Exercer14;

public class Cubo extends Figura3D{
    private int aresta;

    public int getAresta() {
        return aresta;
    }

    public void setAresta(int aresta) {
        this.aresta = aresta;
    }

    @Override
    public double calcularArea() {
        return 6 * (aresta*aresta);
    }

    @Override
    public double calcularVolume() {
        return aresta * aresta * aresta ;
        //OPÇAO 2:: return Math.pow(aresta, 3)
    }
}

