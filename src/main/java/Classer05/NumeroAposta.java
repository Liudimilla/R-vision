package Classer05;

import java.util.Scanner;

// Faça um programa que solicite que o usuario passe 6 numeros para sorteio
public class NumeroAposta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i =0;
        for (;i < 10;){
            System.out.println(" o seu numero da sorte e: " + i);
            i++;
        }
        System.out.println(i);
    }
}
