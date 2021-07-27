package Classer11;
public final class FinalPess {
    private String nome;
    private String endereço;
    private String telefone;
    private String cpf;
    private String telefoneCelular;

    protected String getNomeVisibilidade() {
        return nomeVisibilidade;
    }

    public void setNomeVisibilidade(String nomeVisibilidade) {
        this.nomeVisibilidade = nomeVisibilidade;
    }

    public String nomeVisibilidade;

    public FinalPess() { }

    public FinalPess(String nome, String endereço, String telefone) {
        super();
        this.nome = nome;
        this.endereço = endereço;
        this.telefone = telefone;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }
}
