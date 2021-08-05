//Questao 43.3::.
package Exercer13;
public class JardimZoológico {
    public static void main(String[] args) {

        Animais camelo = new Animais();
        camelo.setNome("Camelo");
        camelo.setComprimento(150);
        //camelo.setPatas(4);
        camelo.setCor("Amarelo");
        camelo.setAmbiente("Terra");
        camelo.setVelocidade(2);

        Peixe tubarao = new Peixe();
        tubarao.setNome("Tubarão");
        tubarao.setComprimento(300);
        tubarao.setPatas(0);
        tubarao.setCor("Cinzento");
        tubarao.setAmbiente("Mar");
        tubarao.setVelocidade(1.5);
        tubarao.setCaracteristica("Barbatanas e cauda");

        Mamífero urso = new Mamífero();
        urso.setNome("Panda Fofinho");
        urso.setComprimento(180);
        urso.setPatas(4);
        urso.setCor("Vermelho");
        urso.setAmbiente("Terra ");
        urso.setVelocidade(0.5);

        Animais[] animais = new Animais[3];
        animais[0] = camelo;
        animais[1] = tubarao;
        animais[2] = urso;

        System.out.println("_____________________");
        for (Animais animal: animais){
            System.out.println(animal);
            System.out.println("_____________________");
        }

    }
}
