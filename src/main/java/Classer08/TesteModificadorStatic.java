//Al 34.
package Classer08;

public class TesteModificadorStatic {
    static int resultSoma;
    public static void main(String[] args) {
        //Opçao 3
        resultSoma = ModificadorStatic.soma(1,2);


        //ModificadorStatic calc = new ModificadorStatic();
        //calc.soma(1,2);
        //calc.soma(1.0, 2.0);

        //Opçao 2:
        //ModificadorStatic.soma(1,2);
        //ModificadorStatic.soma(1.0,2.0);
  soma2Valores(1, 2);
    }
    static int soma2Valores(int num2,int num1) {
        return ModificadorStatic.soma(num1, num2);

    }
}
