//Al 33 ::Sobrecarga de métodos e construtores (overload)
package Classer07;

public class MinhaCalculadora {
    //Sobrecarga de Metodos.
    public int soma(int num1, int num2){
        return num1 + num2;

    } // tipo de polimofismo, em tempo compilaçao
    public double soma(double num1, int num2) {
        return num1 + num2;
    }
    public int soma(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    public int soma(int[] vetorInteiros) {
        int total = 0;

        for (int i=0; i<vetorInteiros.length; i++) {
            total += vetorInteiros[i];
        }
        return total;
    }
}

