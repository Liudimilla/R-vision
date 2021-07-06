package Classer06;
//Al.25; Definiçao de Sapato e seus atributos(Metodo Simples s/c parametros);
public class TesteCalcado {
    public static void main(String[] args) {


        Calcado tenis = new Calcado();
        tenis.tipo = "Esporte";
        tenis.modelo = "Nike";
        tenis.unidade = 10;
        tenis.valor = 58.00;

        System.out.println(tenis.tipo);
        System.out.println(tenis.modelo);

        tenis.exibirCompra();

    }
}
