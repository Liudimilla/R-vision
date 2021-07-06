package Classer04;

import java.util.Scanner;

public class ListaConvidados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do paciente");
        String nome = scanner.nextLine();
        System.out.println("Digite o nome do medico; 1-Dr.Carlos - 2-Dra Camille");
        int medico = scanner.nextInt();

        if (medico == 1) {
            System.out.println("Sua consulta esta marcada");
            System.out.println("Consulta marcada para o paciente: " + nome);
            System.out.println("Consulta marcada com o Dr Dr.Carlos " );

        } else if (medico == 2) {
            System.out.println("Sua consulta esta marcada");
            System.out.println("Consulta marcada para o paciente: " + nome);
            System.out.println("Consulta marcada com o Dra Camille ");
        }



    }
}
