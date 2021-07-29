//Al 50 Exceptions: stacktrace e throws
package Classer12;

import java.util.Scanner;

public class UsandoThrows {
    public static void main(String[] args) {
        System.out.println("Entre com um numero decimal");
    try {
        double num = leNumero();
        System.out.println("voce digitou "+num);
        }catch (Exception e){
        System.out.println("entrada invalida");
        e.printStackTrace();
}
    }
    public static double leNumero() throws Exception{
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        return num;
    }
}