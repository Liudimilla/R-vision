package Exercer05;

public class ContatosCelular {
    public static void main(String[] a) {


        AgendaCelular milla = new AgendaCelular();
        milla.nome = "Liudimilla";
        milla.email = "milla@gmail.com";
        milla.endereco = "Rua Sao pedro";

        milla.telefoneMovel = new String[2];
        milla.telefoneMovel[0] = "9999-9999";
        milla.telefoneMovel[1] = "8199-9999";

        milla.telefoneFixo = new String[2];
        milla.telefoneFixo [0] = "2345-1234";
        milla.telefoneFixo [1] = "3445-1234";

        System.out.println("Contato 1");
        System.out.println("Nome: "+milla.nome);
        System.out.println("Email: "+milla.email);
        System.out.println("Endereço: "+milla.endereco);
        System.out.println("Numero de telefone Movel:\t| Opçao 1 "+milla.telefoneMovel[0]+"\t| Opçao 2"+milla.telefoneMovel[1]);
        System.out.println("Numero de telefone Fixo:\t| Opçao 1 "+milla.telefoneFixo[0]+"\t| Opçao 2"+milla.telefoneFixo[1]);




    }
}
