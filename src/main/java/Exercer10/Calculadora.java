/* Questao 35.2:: Escreva  uma  classe  Calculadora  que  tenha
 os  seguintes  métodos:  somar,   subtrair,  multiplicar,  dividir  (dois
  números),  elevar  à  potência  n.   Desenvolva  um  programa  para
  testar  essa  classe.  */
package Exercer10;
public class Calculadora {


        public static int somar ( int num1, int num2){
            return num1 + num2;
        }
        public static int subtrair ( int num1, int num2){
            return num1 - num2;
        }
        public static int dividir( int num1, int num2){
            return num1 / num2;
        }
        public static int multiplica( int num1, int num2){
            return num1 * num2;
        }

        public static int potencia( int num1, int num2){
            int total = 1;
            for (int i=1; i<=num2; i++) {
                total *= num1;
            }
            return total;
        }
    }
