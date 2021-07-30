/*Questao 17.27:: O Departamento Estadual de Meteorologia lhe contratou para desenvolver um
programa que leia as um conjunto indeterminado de temperaturas, e informe ao final a menor
 e a maior temperaturas informadas, bem como a média das temperaturas. */

package Exercer02;

import java.util.Scanner;

public class Meteorologia {
    public static void main(String[] args) {
        Scanner milla = new Scanner(System.in);

        System.out.println("Entre com quantidade de temperatura: ");
        int grauTemperatura = milla.nextInt();
        double temp;
        double soma = 0;
        double menor = Double.MAX_VALUE; //para pegar menor valor.
        double maior = Double.MIN_VALUE;

        for (int i=1; i<=grauTemperatura; i++) {
            System.out.println("Entre com a temperatura"+i);
            temp = milla.nextDouble();

            soma += temp;

            if (temp>maior){
                maior = temp;
            }
            if (temp<menor){
                maior = temp;
            }
        }
        System.out.println("Media: "+(soma/grauTemperatura));
        System.out.println("Menor temperatura: "+menor);
        System.out.println("Maior temperatura: "+maior);
    }
}
