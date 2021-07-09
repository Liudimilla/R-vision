// Questao 15.3; Faça um programa que verifique se uma letra digitada e
// vogal ou consoante.
package Classer02;

import java.util.Scanner;

public class VogalConsoante {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        String let = scan.next();

        if (let.equalsIgnoreCase("a") ||
                let.equalsIgnoreCase("e") ||
                let.equalsIgnoreCase("i") ||
                let.equalsIgnoreCase("o") ||
                let.equalsIgnoreCase("u")) {

            System.out.println("Vogal");
        } else {
            System.out.println("Consoante");
        }
    }
}

        /*  OPÇAO 2::
        switch (let) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("Vogal"); break;
            default: System.out.println("Consoante");


        }

    }
}
*/