package Classer04;

import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome completo e: " +nomeCompleto);

        System.out.println("Digite seu primeiro nome: ");
        String primeironome = scan.next();
        System.out.println("Seu primeiro nome: " + primeironome);

        System.out.println("Digite a sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Sua idade é: " +idade);

        System.out.println("Digite a sua altura:");
        double altura = scan.nextDouble();
        System.out.println("A sua altura e: " +altura);

 /*
        // Opçao 2º
    System.out.println("Digite o seu nome, idade, quantidade de filhos, altura,nome bicho de estimaçao");
    String primeiroNome = scan.next();
    int idade = scan.nextInt();
    byte qtdFilhos = scan.nextByte();
    float altura = scan.nextFloat();
    boolean temPet = scan.nextBoolean();

    System.out.println("Voce digitou os seguintes dados: ");
        System.out.println("Primeiro nome: " + primeiroNome);
        System.out.println("Idade: " + idade);
        System.out.println("Quantidade de filhos: " + qtdFilhos);
        System.out.println("Altura: " +altura);
        System.out.println("Tem bichinho de estimaçao? " + temPet);
*/
    }
}
