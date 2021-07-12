/*Questao 31.3. Escreva  uma  classe  para  representar  um  Aluno.  Adicione  atributos
relacionados  às  caracteristicas  de  um  Aluno,  como  nome,  matricula,  curso   que  está
atriculado,  nome  de  3  disciplinas  que  está  cursando  e  as  notas   dessas  3  disciplinas.
Desenvolva  um  método  para  verificar  se  o  aluno  está   aprovado  (nota  maior  ou  igual
a  7)  em  uma  determinada  disciplina.   Escreva  um  programa  para  testar  essa  classe,
que  pede  as  informações  do   aluno  ao  usuário  e  ao  final  informa  o  nome  das
disciplinas,  mostra  as   notas  e  mostra  se  o  aluno  foi  aprovado  ou  não.
 */
package Exercer09;

public class Aluno {
    String nome;
    String curso;
    String matricula;
    double nota;

    void exibirParte() {
        System.out.println("Nome: " +nome+ "\nCurso: " +curso);

    }



}

