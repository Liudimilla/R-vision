/*Questao 24.4;Usando  o  resultado  do  modelo  “Livro”  como  base,  crie  uma  classe
  “LivroDeBiblioteca”  que  represente  os  dados  básicos  de  um  livro  de  uma   biblioteca,
   que  pode  ser  emprestado  a  leitores.
 */
package Exercer05;

import java.util.Date;

public class Biblioteca {
    String nome;
    String autor;
    int qtdPaginas;
    int anoLancamento;
    String isbn;
    String produto;
    String tipoCapa;
    String idioma;

    boolean emprestado;
    Date dataEmtrega;
    String emprestadoA;

}
