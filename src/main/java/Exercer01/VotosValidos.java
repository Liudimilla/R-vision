package Exercer01;

import java.util.Scanner;

public class VotosValidos {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número total de eleitores: ");
        int totalDeEleitores = scan.nextInt();

        System.out.println("Percentual de votos válidos: " + votosValidos(200) / totalDeEleitores + "%");
        System.out.println("Percentual de votos brancos: " + votosBrancos(150) / totalDeEleitores + "%");
        System.out.println("Percentual de votos nulos: " + votosNulos(10) / totalDeEleitores + "%");

    }

    private static int votosValidos(int votosValidos) {
        return (votosValidos * 100);
    }

    private static int votosBrancos(int votosBrancos) {
        return (votosBrancos * 100);
    }

    private static int votosNulos(int votosNulos) {
        return (votosNulos * 100);
    }
}

