/*Questao 11; Faça um programa que peça o tamanho de um arquivo para download (em MB)
e a velocidade de um link de Internet (em Mbps), calcule e informe o tempo aproximado
de download do arquivo usando este link (em minutos)
 */

package Exercer01;

import java.util.Scanner;

public class VelocidadeLink {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o tamanho: ");
        double tamArquivo = scanner.nextDouble();

        System.out.println("Entre a velocidade da internet: ");
        double velInt = scanner.nextDouble();

        double tem = tamArquivo / velInt;

        System.out.println("Tempo de download: "+tem);





    }
}
