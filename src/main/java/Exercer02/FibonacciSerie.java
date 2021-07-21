/*Questao 17.16.A série de Fibonacci é formada pela seqüência 0,1,1,2,3,5,8,13,21,34,55,...
 Faça um programa que gere a série até que o valor seja maior que 500.
 */
package Exercer02;
public class FibonacciSerie {
    public static void main(String[] args) {

        int pri = 1;
        int seg = 1;
        int prox = 0;

        System.out.println(pri);
        System.out.println(seg);

        while (prox <= 500) {
            prox = pri + seg;
            pri = seg;
            seg = prox;

            System.out.println(prox);
        }
    }
}

