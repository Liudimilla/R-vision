package Classer01;

import java.util.Scanner;

//Questao 13.3; Faça um programa que peça as 4 notas bimestrais e mostre a media.
public class MediaEscolar {
    public static void main (String [] args){
        Scanner x = new Scanner(System.in);

        System.out.println("Digite sua primenira nota");
        double av1 = x.nextDouble();

        System.out.println("Digite sua segunda nota");
        double av2 = x.nextDouble();

        System.out.println("Digite sua terceira nota");
        double av3 = x.nextDouble();

        System.out.println("Digite sua quarta nota");
        double av4 = x.nextDouble();

        double media;
        media = (av1 + av2 + av3 + av4)/4;

        System.out.println("Sua nota final e: " + media);
    }
}
