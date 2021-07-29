//Al 52 Exceptions: criando sua própria exceção;
package Classer12;
public class DivisaoNaoExata extends Exception{
    private int num;
    private int dem;

    public DivisaoNaoExata(int num, int dem) {
        super();
        this.num = num;
        this.dem = num;
    }
    @Override
    public String toString() {
        return "Resultado de "+num+ "/"+dem+"nao e um inteiro!";
    }


}
