/*Questao 20.5; Modifique o programa anterior de maneira a guardar os compromissos
de todo o ano, organizados por mês, dia e hora (só 8 horas por dia).
 */
package Exercer04;

import java.util.Scanner;

public class AgendaAnual {
    public static void main(String[] args) {
        Scanner milla = new Scanner(System.in);

        String[][][][] compromissos = new String[3000][12][31][24];

        byte opcao; // Pq e um digito
        boolean sair = false;
        while (!sair) {
            System.out.println("Digite 1 PARA ADICIONAR compromisso");
            System.out.println("Digite 2 PARA VERIFICAR compromisso");
            System.out.println("Digite 0 PARA Sair");

            opcao = milla.nextByte();

            if (opcao == 1) {
                boolean anoValido = false;
                int ano = 0;
                while (!anoValido) {
                    System.out.println("Entre com o ANO: ");
                    ano = milla.nextInt();
                    if (ano > 0 && ano <= 3000) {
                        anoValido = true;
                    } else {
                        System.out.println("Opçao invalida, digite novamente");
                    }
                }
                boolean mesValido = false;
                int mes = 0;
                while (!mesValido) {
                    System.out.println("Entre com o MES: ");
                    mes = milla.nextInt();
                    if (mes > 0 && mes <= 12) {
                        mesValido = true;
                    } else {
                        System.out.println("Opçao invalida, digite novamente");
                    }
                }
                boolean diaValido = false;
                int dia = 0;
                while (!diaValido) {
                    System.out.println("Entre com o DIA ");
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
                    System.out.println("Entre com o hora do COMPROMISSO: ");
                    hora = milla.nextInt();
                    if (hora > 0 && hora <= 24) {
                        horaValido = true;
                    } else {
                        System.out.println("Opçao invalida, digite novamente");
                    }
                }
                ano--; //para tirar uma valor pq se colocar 20 o sistema acessar a posiçao 19
                mes--;
                dia--;
                System.out.println("Digite o compromisso");
                compromissos[ano][mes][dia][hora] = milla.next();

            } else if (opcao == 2) { // verifica
                boolean anoValido = false;
                int ano = 0;
                while (!anoValido) {
                    System.out.println("Entre com o Ano: ");
                    ano = milla.nextInt();
                    if (ano > 0 && ano <= 3000) {
                        anoValido = true;
                    } else {
                        System.out.println("Opçao invalida, digite novamente");
                    }
                }
                boolean mesValido = false;
                int mes = 0;
                while (!mesValido) {
                    System.out.println("Entre com o MES: ");
                    mes = milla.nextInt();
                    if (mes > 0 && mes <= 31) {
                        mesValido = true;
                    } else {
                        System.out.println("Opçao invalida, digite novamente");
                    }
                }
                boolean diaValido = false;
                int dia = 0;
                while (!diaValido) {
                    System.out.println("Entre com o DIA: ");
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
                    System.out.println("Entre com o HORA: ");
                    hora = milla.nextInt();
                    if (hora > 0 && hora <= 24) {
                        horaValido = true;
                    } else {
                        System.out.println("Opçao invalida, digite novamente");
                    }
                }
                ano--; //para tirar uma valor pq se colocar 20 o sistema acessar a posiçao 19
                mes--;
                dia--;
                System.out.println("O compromisso agendado e : "+"\nDia: "+dia+"\nHora: "+hora+"\nMes: "+mes+"\nAno: "+ano);
                System.out.println("Compromisso: \t\t"+ compromissos[ano][mes][dia][hora]);
            } else if (opcao == 0) {
                sair = true;
            } else {
                System.out.println("Opçao invalida, digite novamente");
            }


        }
    }
}
