//Questao 43.3::.
package Exercer13;
public class Mamífero extends Animais {
    private String alimento;

    public Mamífero() {
        super();
        this.setCor("Castanho");
        this.alimento = "Mel";
        this.setAmbiente("Terra");
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        String s = super.toString();
        s += "\nAlimento: " + alimento;
        return s;
    }
}