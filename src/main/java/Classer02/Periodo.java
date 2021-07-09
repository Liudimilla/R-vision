// Questao 15.10;Faça um programa que pergute em que turno
// voce estuda. Peça para digitar M-maturino ou V-vespetino ou N-noturno.
// Imprima a mensagem " Bom dia", " Boa tarde", ou " Boa noite" ou Valor Invalido, conforme o caso.
package Classer02;

import java.util.Scanner;

public class Periodo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean M,V,N;

        System.out.println("Informe o periodo que voce estuda M-maturino ou V-vespetino ou N-noturno:");
        String per = scan.next();


        if (per.equals("M")) {
            System.out.println("Bom dia, boa aula");
        }
        if (per.equals("V")) {
            System.out.println("Boa tarde, boa aula");
        }
        if (per.equals("N")) {
            System.out.println("Boa noite, boa aula");
        }
        else {
            System.out.println("Sexo Invalido");
        }
        /* OPCAO 2 ::
        switch(turno) {
        case "n ":
        case "N":System.out.println("Bom dia, boa aula");break;
        case " V ":
        case " v ":("Boa tarde, boa aula");break;
        case " n":
        case " N": ("Boa noite, boa aula");break;
        defaut: System.out.println("Sexo Invalido");

         */
    }
}
