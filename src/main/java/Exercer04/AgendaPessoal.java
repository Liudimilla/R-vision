/*Questao 20.4; Faça um programa para armazenar em uma matriz os compromissos de uma
agenda pessoal. Cada dia do mês deve conter 24 horas, onde para cada uma destas 24 horas podemos
associar um tarefa específica (compromisso agendado). O programa deve ter um menu onde o usuário
indica o dia do mês que deseja alterar e a hora, entrando em seguida com o compromisso, ou então,
o usuário pode também consultar a agenda, fornecendo o dia e a hora para obter o compromisso armazenado.
 */
package Exercer04;

import java.util.Scanner;

public class AgendaPessoal {
    public static void main(String[] args) {
        Scanner milla = new Scanner(System.in);

        String[][] compromissos = new String[31][24];

        byte opcao; // Pq e um digito
        boolean sair = false;
        while (!sair) {
            System.out.println("Digite 1 PARA ADICIONAR compromisso");
            System.out.println("Digite 2 PARA VERIFICAR compromisso");
            System.out.println("Digite 0 PARA Sair");

            opcao = milla.nextByte();

            if (opcao == 1) {
                boolean diaValido = false;
                int dia = 0;
                while (!diaValido) {
                    System.out.println("Entre com o dia do mes: ");
                    dia = milla.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Opçao invalida, digite novamente");
                    }
                }
                boolean horaValido = false;
                int hora = 0;
                while (!horaValido) {
                    System.out.println("Entre com o hora do compromisso: ");
                    hora = milla.nextInt();
                    if (hora > 0 && hora <= 24) {
                        horaValido = true;
                    } else {
                        System.out.println("Opçao invalida, digite novamente");
                    }
                }
                dia--; //para tirar uma valor pq se colocar 20 o sistema acessar a posiçao 19
                System.out.println("Digite o compromisso");
                compromissos[dia][hora] = milla.next();

            } else if (opcao == 2) { // verifica
                boolean diaValido = false;
                int dia = 0;
                while (!diaValido) {
                    System.out.println("Entre com o dia do mes: ");
                    dia = milla.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Opçao invalida, digite novamente");
                    }
                }
                boolean horaValido = false;
                int hora = 0;
                while (!horaValido) {
                    System.out.println("Entre com o hora do compromisso: ");
                    hora = milla.nextInt();
                    if (hora > 0 && hora <= 24) {
                        horaValido = true;
                    } else {
                        System.out.println("Opçao invalida, digite novamente");
                    }
                }
                dia--;
                System.out.println("O compromisso agendado e : "+"\nDia: "+dia+"\nHora: "+hora);
                System.out.println("Compromisso: "+ compromissos[dia][hora]);
            } else if (opcao == 0) {
                sair = true;
            } else {
                System.out.println("Opçao invalida, digite novamente");
            }


        }
    }
}

