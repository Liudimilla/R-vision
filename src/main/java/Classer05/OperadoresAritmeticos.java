package Classer05;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int resultado = 1 + 2;
        System.out.println(resultado);

        resultado = resultado - 1;
        System.out.println(resultado);

        resultado = resultado * 2;
        resultado = resultado / 2;
        resultado = resultado + 8;
        resultado = resultado % 7;

        String primeiroNome = "Esta é ";
        String segundoNome = "uma String concatenada. ";
        String terceiroNome = primeiroNome + segundoNome;
        System.out.println(terceiroNome);

        resultado = resultado + 1;
        System.out.println(resultado);

        resultado++;
        System.out.println("resultado");
        //OU
        System.out.println(resultado++);
        System.out.println(--resultado);


    }
}
