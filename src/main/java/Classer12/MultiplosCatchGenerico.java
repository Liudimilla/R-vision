//Al 48
package Classer12;
//a parti do Java 7
public class MultiplosCatchGenerico {
    public static void main(String[] args) {
        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] demominadores = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + "/" + demominadores[i] + "=" + numeros[i] / demominadores[i]);
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException exception) {
                System.out.println("Aconteceu um erro");
            }

        }
    }
}
