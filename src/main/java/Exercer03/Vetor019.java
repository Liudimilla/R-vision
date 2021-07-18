/* Questao 19.19; Ler as duas notas bimestrais para um conjunto de 10 alunos. Armazenar as notas
informadas em dois vetores “Nota1” e “Nota2” do tipo real. Escreva um programa que calcule a média
aritmética simples das notas informadas armazenando o resultado em um vetor “Result” de mesmo tipo
e tamanho. Ao mostrar os resultados exibir a situação de cada aluno. Se a média calculada for superior
 ou igual a 7 o aluno estará “aprovado”, caso contrário, a situação do aluno será “reprovado”.
 */
package Exercer03;

import java.util.Scanner;

public class Vetor019 {
    public static void main(String[] args) {
        Scanner milla = new Scanner(System.in);

        int[] nota1 = new int[10];
        int[] nota2 = new int[nota1.length];
        double[] resultados = new double[nota1.length];

        for (int i = 0; i < nota1.length; i++) {
            System.out.println("Entre com a nota 1 Aluno:" + (i + 1));
            nota1[i] = milla.nextInt();

            System.out.println("Entre com a nota 2 Aluno : " + (i + 1));
            nota2[i] = milla.nextInt();

            resultados[i] = (nota1[i] + nota2[i]) / 2;

            }

            System.out.print("Nota 1 = ");
            for (int i = 0; i < nota1.length; i++) {
                System.out.print(nota1[i] + ": ");
            }
            System.out.println();

            System.out.print("Nota 2 = ");
            for (int i = 0; i < nota2.length; i++) {
                System.out.print(nota2[i] + ": ");
            }
            System.out.println();

            System.out.println("Resultado:");
            for (int i = 0; i < resultados.length; i++) {
                if (resultados[i] >=7) {
                    System.out.println(resultados[i] +" - Aprovado");
                } else {
                    System.out.println(resultados[i] + " - Reprovado");

            }


        }
    }
}

