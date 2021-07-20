package Exercer10;

public class ContadorEx01 {
    static void imprimirValor() {
        System.out.println(Contador.obterValor());
    }
    public static void main(String[] args) {
        imprimirValor();
        Contador.incrementar();
        imprimirValor();
        Contador.zerar();
        imprimirValor();

        Contador.incrementar();
        Contador.incrementar();
        Contador.incrementar();

        imprimirValor();

        // chamar o construtor 3x
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();

        imprimirValor();
    }
}
