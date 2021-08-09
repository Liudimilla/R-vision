/*Exercicios Aulas 52.1:: Escreva  uma  classe  Contato  que  contenha  nome,  telefone  e  um   identificador.
 Esse  identificador  deve  ser  gerado  automaticamente  pela   classe  através  de  um
 contador  (cada  vez  que  um  Contato  é  criado  o   contador  é  incrementado  e
 atribuído  ao  identificador).  Crie  uma  classe   Agenda  que  irá  funcionar  para
 gerenciar  os  Contatos.  Essa  classe  precisa   de  ter  um  método  para  adicionar
 um  Contato  e  também  para  consultar.   Crie  uma  classe  Teste  que  informe  um
 menu  ao  usuário:  1-­‐  para  consultar   um  contato  da  agenda  e  2  –  para
 adicionar  um  contato  na  agenda.   Se  o  contato  não  existir,  o  programa  deve
 lançar  uma  exceção  de   ContatoNaoExisteException.  Caso  a  agenda  esteja  cheia
 quando  o  usuário   quiser  adicionar  um  novo  contato,  o  programa  deve  lançar
 uma  exceção   AgendaCheiaExeption.  Trate  também  as  exceções  de  tipo  de  dados
 (caso  o   usuário  entre  com  um  tipo  de  dado  invalido. */
package Exercer15;
public class Agenda {
    private Contato[] contatos;
    public Agenda() {
        contatos = new Contato[5];
    }
    public void adicionarContato(Contato c) throws AgendaCheiaExeption {

        boolean cheia = true;
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] == null) {
                contatos[i] = c;
                cheia = false;
                break;// para terminar o FOR
            }
        }
        if (cheia) {
            throw new AgendaCheiaExeption();
        }

        }
    public int consultaContatoPorNome(String nome) throws ContatoNaoExisteException{
        for (int i=0; i<contatos.length; i++) {
            if (contatos[i] != null) {
                if (contatos[i].getNome().equalsIgnoreCase(nome)) {
                    return i;
                }
            }
        }
        //Lançar exception contato nao existe
        throw new ContatoNaoExisteException(nome);
    }
        @Override
        public String toString () {
            String s = " ";
            for (Contato c : contatos) {
                if (c != null) {
                    s += c.toString() + "\n";
                }
            }
            return s;
        }
    }

