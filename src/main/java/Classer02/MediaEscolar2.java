// Questao 15.4;Faça um programa para a leitura de duas notas parciais de um aluno.
//O programa deve calcular a media alcançada por aluno e apresentar:
//*A menssagem "Aprovado", se a media alcançada for maior ou igual a sete;
//*A menssagem "Reprovado", se a media alcançada for menor ou igual a sete
//*A menssagem "Aprovado com Distinçao", se a media alcançada for igual a dez.
package Classer02;
import java.util.Scanner;
public class MediaEscolar2 {
    public static void main(String[] args) {
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
        media = (av1 + av2 + av3 + av4) / 4;

        if (media >= 7) {
            System.out.println("Aprovado");
        }
        if (media <= 7) {
            System.out.println("Reprovado");
        }
        if (media == 10) {
            System.out.println("Aprovado com Distinçao");

        }
    }
}
