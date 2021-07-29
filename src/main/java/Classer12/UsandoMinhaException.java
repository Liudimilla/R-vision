//Al 52 Exceptions: criando sua própria exceção
package Classer12;
public class UsandoMinhaException {
    public static void main(String[] args) {
        try {
            teste();
        } catch (DivisaoNaoExata e) {
            e.printStackTrace();
        }
    }

        public static void teste() throws DivisaoNaoExata{
            int[] numeros = {4, 8, 5, 16, 21, 32, 64, 128};
            int[] demominadores = {2, 0, 4, 8, 0, 2, 3};

            for (int i = 0; i < numeros.length; i++) {
                try {
                    if(numeros[i] % 2 !=0) {
                        throw new DivisaoNaoExata(numeros[i], demominadores[i]);
                        //if(numeros[i] % 2 !=0) {
                        //
                        //throw new Exception("NUmero impar, divisao nao exata");
                    }

                    System.out.println(numeros[i] + "/" + demominadores[i] + "=" + numeros[i] / demominadores[i]);
                } catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
                    System.out.println("Erro ao dividir por zero");
                    e.printStackTrace();
                }


            }
        }
    }




