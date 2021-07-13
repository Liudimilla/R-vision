/*Questao 25.1. Escreva  uma  classe  para  representar  uma  lâmpada.  Desenvolva
 métodos   para  ligar,  desligar  a  lampada.
 */
package Exercer06;

public class LigarDesligar {
    private String modelo;
    private String tensao;
    private int potencia;
    private String cor;
    private String tipoLuz;
    private int garantiaMeses;
    private String[] tipos;
    private boolean tipoAbajur;
    private boolean ligada;

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