// Questao 35.2::
package Exercer10;
public class CalculadoraTest {
    public static void main(String[] args) {
      imprimirTela(Calculadora.somar(1,2));
      imprimirTela(Calculadora.subtrair(2,1));
      imprimirTela(Calculadora.multiplica(2,2));
      imprimirTela(Calculadora.dividir(4,2));
      imprimirTela(Calculadora.potencia(2,4));

    }
    static void imprimirTela(int num) {
        System.out.println(num);
    }
}