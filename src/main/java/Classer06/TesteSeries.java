package Classer06;

public class TesteSeries {
    public static void main(String[] args) {

        Series lupin = new Series();
        lupin.nome = "Lupin";
       lupin.temporada = 1;
       lupin.capitolo = 19;
        System.out.println(lupin.nome);
        System.out.println(lupin.temporada);

lupin.exibirParte();
int parte = lupin.obterParte();
        System.out.println("a quantidade de series e: " +parte);
        System.out.println("a quantidade de series e: " +lupin.obterParte());

int qtdTemporada10 = lupin.calcularTemporada(10);
int qtdTemporada15 = lupin.calcularTemporada(15);


        System.out.println("qtdTemporada10 = " + qtdTemporada10);
        System.out.println("qtdTemporada15 = " + qtdTemporada15);
}
}