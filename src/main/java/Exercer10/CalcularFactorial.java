/*ConversaoDeUnidadesDeArea3; Escreva um método para calcular factorial
 de um número na classe. Calculadora do exercício anterior.
 */
package Exercer10;
public class CalcularFactorial {

public static int fatorial(int num) {

if (num == 0) {
return 1;
}
int total = 1;
for (int i=num; i>1; i--) {
    total *= i;
}
return total;
}
}

