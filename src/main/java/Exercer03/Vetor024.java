/*Questao 19.24.Números palíndromos são aqueles que escritos da direita para a esquerda têm o mesmo va
lor quando escritos da esquerda para a direita. Exemplo: 545; 789987; 97379; 123454321; etc. Escreva um
programa que verifique se um dado vetor A de 10 elementos inteiros é um palíndromo, ou seja, se o primeiro
 elemento do vetor e igual ao último, se o segundo elemento do vetor é igual ao penúltimo e assim por
 diante até verificar todos os elementos ou chegar a conclusão que o vetor não é um palíndromo.
 */
package Exercer03;

import java.util.Scanner;

public class Vetor024 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i=0; i<vetorA.length; i++) {
            System.out.println("Entre com a posiçao" +i);
            vetorA[i] = scan.nextInt();


            } // para achar o Números palíndromos;
        boolean palíndromo = true;
        for (int i=0; i<vetorA.length/2; i++) {
            if (vetorA[i] != vetorA[vetorA.length - 1 - i]) {
                palíndromo = false;
                break;
            }
        }
        System.out.println("VetorA = ");
        for (int i=0; i<vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println( );

        if (palíndromo) {
            System.out.println("Palindromo");
        } else {
            System.out.println("Nao e Palindromo");
        }
    }
}
