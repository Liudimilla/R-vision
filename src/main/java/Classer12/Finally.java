// Al 49 Exceptions: finally
package Classer12;

public class Finally {
    public static void main(String[] args) {
        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] demominadores = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + "/" + demominadores[i] + "=" + numeros[i] / demominadores[i]);
            } catch (ArithmeticException e1){
                System.out.println("Erro ao dividir por zero");
            } catch (ArrayIndexOutOfBoundsException e2){
                System.out.println("Posisao do array invalida");
            }
            finally {
                System.out.println("Essa linha e impressa sempre apos o try ou catch");
            }
        }
    }
}
