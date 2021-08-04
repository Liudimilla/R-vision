//exerc36.1
package Exercer11;

import Exercer11.AgendaContato;
import Exercer11.Contato;

import java.util.Scanner;

public class AAgendaContato {
    public static void main(String[] args) {
        Scanner milla = new Scanner(System.in);

        System.out.println("Entre com o nome da agenda");
       String nome = milla.nextLine();

        AgendaContato agenda = new AgendaContato(nome);

        Contato[] contato = new Contato[3];
        // array de contatos;
        for (int i = 0; i < 3; i++) {
            System.out.println("Entre com informaçoes de contato" + (i + 1));
            Contato c = new Contato();

            System.out.println("Entre com o nome: ");
            nome = milla.nextLine();
            c.setNome(nome);

            System.out.println("Entre com o telefone: ");
            String telefone = milla.nextLine();
            c.setTelefone(telefone);

            System.out.println("Entre com o email: ");
            String email = milla.nextLine();
            c.setEmail(email);

            contato[i] = c;

        }

        agenda.setContato(contato);
        if (agenda != null) {
            System.out.println(agenda.obterInfo());
        }
    }
}
