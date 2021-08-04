/*Questao 25.1. Escreva  uma  classe  para  representar  uma  lâmpada.  Desenvolva
 métodos   para  ligar,  desligar  a  lampada.
 */
package Exercer06;

public class LigarDesligar {
    public String modelo;
    public String tensao;
    public int potencia;
    public String cor;
    public String tipoLuz;
    public int garantiaMeses;
    public String[] tipos;
    public boolean tipoAbajur;
    public boolean ligada;

    public void mostrarEstado(){
        if (ligada()) {
            System.out.println("Lampada esta ligada");
        } else {
            System.out.println("Lampada esta desligada");
        }
    }
    public void mudarEstado() {
        if (ligada()) {
            desligar();
        } else {
            ligar();
        }
    }

    private boolean ligada() {
        return false;
    }

    public void desligar() {
    }

    public void ligar() {
    }
}