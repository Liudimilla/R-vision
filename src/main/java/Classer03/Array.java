//Classer 20; Armazena a temperatura media dia por 1 ano.
package Classer03;

public class Array {

    public static void main(String[] args) {


        double[] temperatura = new double[365];

        temperatura[0] = 31.3;
        temperatura[1] = 32;
        temperatura[2] = 33.7;
        temperatura[3] = 34;
        temperatura[4] = 33.1;


        System.out.println("O valor da temperatura do dia 1 e:" + temperatura[0]);
        System.out.println("O tamanho do array: " + temperatura.length);
        System.out.println("Valores do array: " + temperatura); // p/localizar o endereço de memoria

        for (int i = 0; i < temperatura.length; i++) {
            System.out.println("O valor da temperatura do dia " + (i+1) + " è: " + temperatura[i]);//para imprimir todos valores do vetores
        }
        for (double temp : temperatura){
            System.out.println(temp);
        }
    }
}
