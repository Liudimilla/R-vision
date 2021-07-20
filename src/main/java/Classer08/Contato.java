//Al 36::
package Classer08;
public class Contato {

    private String nome;
    private ContatoEndereco endereco;
    private ContatoTelefone[] telefones;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ContatoEndereco getEndereco() {
        return endereco;
    }

    public void setEndereco(ContatoEndereco endereco) {
        this.endereco = endereco;
    }

    public ContatoTelefone[] getTelefones() {
        return telefones;
    }

    public void setTelefones(ContatoTelefone[] telefones) {
        this.telefones = telefones;
    }
}

