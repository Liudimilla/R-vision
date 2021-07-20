/*Questao 33.1. Escreva  uma  classe  para  representar  uma  lâmpada.
 Desenvolva  métodos   para  ligar,  desligar  a  lampada.
 */
package Exercer09;

public class LampadaI {
    private String modelo;
    private String tensao;
    private int potencia;
    private String cor;
    private String tipoLuz;
    private int garantiaMeses;
    private String[] tipos;
    private boolean tipoAbajur;
    private boolean ligado;


public LampadaI() {

}
    public LampadaI(String modelo, String tensao, int potencia, String cor, String tipoLuz, int garantiaMeses, String[] tipos, boolean tipoAbajur, boolean ligado) {
        this.modelo = modelo;
        this.tensao = tensao;
        this.potencia = potencia;
        this.cor = cor;
        this.tipoLuz = tipoLuz;
        this.garantiaMeses = garantiaMeses;
        this.tipos = tipos;
        this.tipoAbajur = tipoAbajur;
        this.ligado = ligado;
    }
    //para encapsula campos (get e set)
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTensao() {
        return tensao;
    }

    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoLuz() {
        return tipoLuz;
    }

    public void setTipoLuz(String tipoLuz) {
        this.tipoLuz = tipoLuz;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    public String[] getTipos() {
        return tipos;
    }

    public void setTipos(String[] tipos) {
        this.tipos = tipos;
    }

    public boolean isTipoAbajur() {
        return tipoAbajur;
    }

    public void setTipoAbajur(boolean tipoAbajur) {
        this.tipoAbajur = tipoAbajur;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

public void ligar() {
    //ligado = true;
    setLigado(true); // opao 2 Metodo de encapsulamento
}
public void desligar(){
    //ligado = false;
    setLigado(false); // opao 2 Metodo de encapsulamento
}
public void mostrarEstado() {
     if (isLigado()) { // isligado utilizando o metodo do GET e SET
         System.out.println("Lampada esta ligada");
     } else {
         System.out.println("Lampada esta desligado");
     }
}
public void mudarEstado() {
    if (isLigado()) {
        desligar();
    } else {
        ligar();
    }
}
}