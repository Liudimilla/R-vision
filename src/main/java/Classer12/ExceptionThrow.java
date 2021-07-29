//Al 50 Exceptions: stacktrace e throws
package Classer12;
public class ExceptionThrow {
    public static void main(String[] args) {
        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] demominadores = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + "/" + demominadores[i] + "=" + numeros[i] / demominadores[i]);
            } catch (Exception e){
                System.out.println(e.getMessage());
                //para mostrar onde esta o erro
                e.printStackTrace();
            }
//nao se debug o codigo que nao tem erro
        }
    }

}
