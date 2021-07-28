/*Q 44.1. Escreva  uma  classe  FiguraGeometrica  com  atributos
 nome  e  cor.  Escreva   uma  classe  Figura2D  e  uma  classe  Figura3D.
 Ambas  classes  Figura2D  e   Figura3D  são  subclasses  da  classe
 FiguraGeometrica.  Crie  ainda  as  classes   Circulo,  Quadrado  e
 Triangulo  que  estendem  a  classe  Figura2D  e  crie   também  as
 classes  Cubo  e  Cilindro  e  Piramide  que  estendem  a  classe Figura3D.
 */
package Exercer14;
public abstract class FiguraGeometrica {
//obs.: como tem atributo nao pode ser INTERFACE tem ser CLASS
    public String nome;
    public String cor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
