/* Questao 35.1::.Escreva um método recursivo e estático que calcule e retorne
o N-­‐ésimo termo da sequência Fibonacci. Alguns números desta sequência  são:
    0,  1,   1,  2,  3,  5,  8,  13,  21,  34,  55,  89... */
package Exercer10;
public class Fibonacci {
    public static int fibonacci(int num) {
        if (num < 2) {
            return 1;
        }
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }

