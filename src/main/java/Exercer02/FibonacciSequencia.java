/*Questao 17.15:.A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,...
Faça um programa capaz de gerar a série até o n−ésimo termo.
 */
package Exercer02;

import java.util.Scanner;

public class FibonacciSequencia {

    public static void main(String[] args) {

        Scanner milla = new Scanner(System.in);

        System.out.println("Entre com o n-ésimo termo da serie de Fibonacci: ");
        int num = milla.nextInt();

        int pri = 1;
        int seg = 1;
        int prox;

        System.out.println(pri);
        System.out.println(seg);

         //1,1,2,3,5
        //primeiro = 1
        //segundo = 2
        //proximo = 3
        for (int i=3; i<num; i++) {
               prox = pri+seg;
               pri = seg;
               seg = prox;

            System.out.println(prox);


        }


    }
}
