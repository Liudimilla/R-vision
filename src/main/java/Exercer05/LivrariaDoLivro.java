///*Questao 24.3;
package Exercer05;
public class LivrariaDoLivro {
    public static void main(String[] args) {
        LivroDeLivraria mistérioRevelado = new LivroDeLivraria();
        mistérioRevelado.nome = "Mais Esperto Que o Diabo";
        mistérioRevelado.ano = 2014;
        mistérioRevelado.acabamento = "Brochura";
        mistérioRevelado.autor = "Hill, Napoleon";
        mistérioRevelado.idioma = "Portugues";
        mistérioRevelado.numPagina = 208;
        mistérioRevelado.quantidade = 1;

        LivroDeLivraria game = new LivroDeLivraria();
        game.conteudo = "Xbox One";
        game.nomeGame = "Monster Hunter";
        game.idiomaG = "Inglês";
        game.legenda = "Português";

        LivroDeLivraria livraria = new LivroDeLivraria();

        livraria.nome = " Mastering ExtJS";
        livraria.autor = "Loiane Groner";
        livraria.preco = 63.80;

        System.out.println("**** Livro 1 ******");
        System.out.println("Nome do livro = " + mistérioRevelado.nome);
        System.out.println("Ano de Lançamento = " + mistérioRevelado.ano);
        System.out.println("Acabamento do livro = " + mistérioRevelado.acabamento);
        System.out.println("Nome do Autor = " + mistérioRevelado.autor);
        System.out.println("Idioma do livro = " + mistérioRevelado.idioma);
        System.out.println("Numero de paginas = " + mistérioRevelado.numPagina);
        System.out.println("Quantida de Livros = " + mistérioRevelado.quantidade);

        System.out.println("\n**** Livro 2 ******\b");
        System.out.println("Conteudo = " + game.conteudo);
        System.out.println("Nome do Game = " + game.nomeGame);
        System.out.println("Idioma do jogo = " + game.idiomaG);
        System.out.println("legenda do jogo = " + game.legenda);

        System.out.println("\n**** Livro 3 ******\r");
        System.out.println("Nome do livro = " + livraria.nome);
        System.out.println("Nome do Autor = " + livraria.autor);
        System.out.println("Valor = " + livraria.preco);
    }
}
