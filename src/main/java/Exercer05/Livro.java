package Exercer05;

public class Livro {
    public static void main(String[] args) {

        DadosLivro livro = new DadosLivro();
        livro.nome = "Crepusculo";
        livro.autor = "Stephenie Meyer";
        livro.anoLancamento = 2015;
        livro.isbn = "9788598078410";
        livro.qtdPaginas = 464;
        livro.produto = "Livro - Crepúsculo";
        livro.idioma = "Português";
        livro.tipoCapa = "Brochura";

        System.out.println(" **** Livro *****");
        System.out.println("Nome do produto = "+livro.produto);
        System.out.println("Nome do nome = "+livro.nome);
        System.out.println("Nome do Autor = "+livro.autor);
        System.out.println("Nome do Ano de Lançamento = "+livro.anoLancamento);
        System.out.println("Nome do ISBN = "+livro.isbn);
        System.out.println("Nome do quantidade de pagina = "+livro.qtdPaginas);
        System.out.println("Nome do produto = "+livro.produto);
        System.out.println("Nome do idioma = "+livro.idioma);
        System.out.println("Nome do tipo de capa  = "+livro.tipoCapa);



    }
}
