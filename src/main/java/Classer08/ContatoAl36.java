package Classer08;

public class ContatoAl36 {

    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setNome("Liudimilla");
        //contato.setEndereco("Rua Silva");
        //contato.setTelefone("11 9999-9999");

        //criar objetivo endereço - relacionamento tem um telefonico.:
        ContatoEndereco end = new ContatoEndereco();
        end.setNomeRua("Rua Lopes");
        end.setNumero("S/n");
        end.setComplemento("-");
        end.setCidade("Kngui");
        end.setEstado("Vitoria");
        end.setCep("999778123");

        contato.setEndereco(end);

        //relacionamento tem um telefonico
        ContatoTelefone telefone = new ContatoTelefone();
        telefone.setTipo("Celular");
        telefone.setDdd("11");
        telefone.setNumero("8967-89785");

        ContatoTelefone telefone2 = new ContatoTelefone();
        telefone2.setTipo("Casa");
        telefone2.setDdd("11");
        telefone2.setNumero("2067-89785");

        ContatoTelefone[] telefones = new ContatoTelefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;

        //contato.setTelefone(telefone);
        contato.setTelefones(telefones);

//Teste saida do console;
        System.out.println(contato.getNome());
        // opçao 2 /System.out.println(contato.getEndereco().getCidade());
        // opçao 2 /System.out.println(contato.getTelefone());

        if (contato != null && contato.getEndereco() != null) {
            System.out.println(contato.getEndereco().getCidade());
        }
        if (contato != null && contato.getTelefones() != null) {
            for (ContatoTelefone t : contato.getTelefones()) {
                System.out.println(t.getDdd() + " " + t.getNumero());
            }
        }
    }
}
