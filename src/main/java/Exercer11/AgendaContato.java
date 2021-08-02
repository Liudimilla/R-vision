/* Questao 36.1. Escreva  uma  classe  Agenda,  que  contém  vários  contatos
do  tipo  Contato.   Cada  contato  possui  nome,  telefone  e  email.  A
Agenda  também  possui  um   nome.  Crie  um  programa  teste  que  peça  para
o  usuário  entrar  com  o   nome  da  Agenda  e  em  seguida  3  contatos.
Crie  métodos  que  retornem   uma  String  com  a  informação  de  cada
contato  e  também  de  todos  os   contatos  da  agenda.
 */
package Exercer11;

public class AgendaContato {
    private String nome;
    private Contato [] contato;

    //construtor
    public AgendaContato(){

    }
    public AgendaContato(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato[] getContato() {
        return contato;
    }

    public void setContato(Contato[] contato) {
        this.contato = contato;
    }
    public String obterInfo() {
        String info = "Nome = "+nome+"\n";

        if (contato != null) {
            for (Contato c: contato) {
                info += c.obterInfo() + "\n";
            }
        }

        return info;
    }
}
