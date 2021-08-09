//Exercicios Aulas 52.1::
package Exercer15;
public class ContatoNaoExisteException extends Exception{

    private String nomeContato;

    public ContatoNaoExisteException(String nomeContato) {
        this.nomeContato = nomeContato;
    }
    @Override
    public String getMessage() {
        return "Contato" + nomeContato+ "NAO existe na agenda!";
    }
}
