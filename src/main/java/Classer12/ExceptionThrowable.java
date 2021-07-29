//Al 48
package Classer12;
public class ExceptionThrowable {
    public static void main(String[] args) {
        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] demominadores = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + "/" + demominadores[i] + "=" + numeros[i] / demominadores[i]);
            } catch (ArithmeticException e1){
                System.out.println("Erro ao dividir por zero");
            } catch (Throwable e2){
                System.out.println("Ocorreu um erro ");
            }

        }
    }
}
