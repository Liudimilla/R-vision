/*Questao 27.1; Escreva  uma  classe  para  representar  uma
lâmpada.  Desenvolva  métodos   para  ligar,  desligar  a  lampada.
 */
package Exercer08;

public class Lampada {
    String modelo;
    String tensao;
    int potencia;
    String cor;
    String tipoLuz;
    int garantiaMeses;
    String[] tipos;
    boolean tipoAbajur;
    boolean ligado;

    void ligar() {
        ligado = true;
    }

    void desligar() {
        ligado = false;
    }
    void mostrarEstado() {
        if (ligado) {
            System.out.println("Lampada esta ligada");
        } else {
            System.out.println("Lampada.instance initializer");
        }
    }
        void mudarEstado(){
            if (ligado) {
                desligar();
            } else {
                ligar();
            }
        }
    }

