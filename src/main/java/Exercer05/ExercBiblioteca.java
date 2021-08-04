//Exercicio 24.4;
package Exercer05;

import java.util.Date;

public class ExercBiblioteca {
    public static void main(String[] args) {

        Biblioteca livro = new Biblioteca();

        livro.nome = "Crepusculo";
        livro.autor = "Stephenie Meyer";
        livro.anoLancamento = 2015;
        livro.isbn = "9788598078410";
        livro.qtdPaginas = 464;
        livro.produto = "Livro - Crepúsculo";
        livro.idioma = "Português";
        livro.tipoCapa = "Brochura";

        livro.emprestado = true;
        livro.dataEmtrega = new Date(01-11-2019);
        livro.emprestadoA = "Milla";

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

        System.out.println("\nFICHA DE ALUGUEL");
        System.out.println("Status do Livro: " +livro.emprestado);
        System.out.println("Data de entrega: " +livro.dataEmtrega);
        System.out.println("Nome do Locatario: " +livro.emprestadoA);



    }
}