package Exercer02;

import java.util.Scanner;

//Crie um codigo que calcule as dimensoes de um angulo.
public class CalculoArea {

    public static void main(String[] args) {
    }

   {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a base do retangulo: ");
        float base = scan.nextFloat();


        System.out.println("Digite a alturra do retangulo");
        float altura = scan.nextFloat();

        System.out.println("Dimensoes do retangulo: ");
        System.out.println(obterDimensao(base, altura));

    }
    private float obterDimensao(float base, float altura){


        return base * altura;
    }
    
}


