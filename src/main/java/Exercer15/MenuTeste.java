//Exercicios Aulas 52.2::
package Exercer15;

import java.util.Scanner;

public class MenuTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();

        int opcao = 1;

        while (opcao != 3) {
            opcao = obterOpcaoMenu(scanner);
            if (opcao == 1) { //Consultar contato
                consultaContato(scanner, agenda);
            } else if (opcao == 2) {//Adicionar contato
                adicionarContato(scanner, agenda);
            }
        }
    }
    public static void adicionarContato(Scanner scanner, Agenda agenda) {
        try {
        System.out.println(" Criando um contato, entre com as informaçoes: ");
        String nome = leInformacaoString(scanner, "Entre com o nome do contato: ");
        String telefone = leInformacaoString(scanner, "Entre com o nome do telefone: ");
        String email = leInformacaoString(scanner,"Entre com o email: ");

        Contato contato = new Contato();
        contato.setNome(nome);
        contato.setEmail(email);
        contato.setTelefone(telefone);

        System.out.println("Contato a ser criado: ");
        System.out.println(contato);

        agenda.adicionarContato(contato);
        } catch (AgendaCheiaExeption e) {
        System.out.println(e.getMessage());

        System.out.println("Contatos da agenda ");
        System.out.println(agenda);
        }

    }

    public static void consultaContato(Scanner scanner, Agenda agenda) {
        String nomeContato = leInformacaoString(scanner,"Entre com o nome do contato a ser pesquisado: ");
        try {
            if (agenda.consultaContatoPorNome(nomeContato)>=0){
                System.out.println("Contato existe");
            }
        } catch (ContatoNaoExisteException e) {
            System.out.println(e.getMessage());
        }
    }
    public static String leInformacaoString(Scanner scanner, String msg) {
        System.out.println(msg);
        String entrada = scanner.nextLine();
        return entrada;
    }
        /* PRIMEIRO TESTE :::
        Contato c1 = new Contato();
        System.out.println(c1);

        Contato c2 = new Contato();
        System.out.println(c2);

        Contato c3 = new Contato();
        System.out.println(c3);
*/
     public static int obterOpcaoMenu(Scanner scanner) {

         boolean entradaValida = false;
         int opcao = 3;
         while (!entradaValida) {
             System.out.println("\n Digite a opçao desejada: \t\t");
             System.out.println("1 : Consultar contato ");
             System.out.println("2 : Adicionar contato ");
             System.out.println("3 : Sair ");

             try {
                 String entrada = scanner.nextLine();
                  opcao = Integer.parseInt(entrada);
                 if (opcao == 1 || opcao == 2 || opcao == 3) {
                     entradaValida = true;
                 } else {
                     throw new Exception("Entrada invalida");
                 }

             }
             catch (Exception e) {
                 System.out.println("Entrada invalida, digite novamente\n");
             }

         }
return opcao;
     }
    }

