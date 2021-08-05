//Questao 43.3::.
package Exercer13;
public class Peixe extends Animais {
    //codificaçao do atributo das características da classe ANIMAL;
    private String caracteristica;
    public Peixe() {
       super();
       this.setPatas(0);
       this.setAmbiente("Mar");
       this.setCor("Cinzenta");
       this.caracteristica = "Barbatana e cauda";
   }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }
    @Override
    public String toString() {
        String s = super.toString();
        s += "\nCaracteristica: "+caracteristica;
        return s;
    }
}
