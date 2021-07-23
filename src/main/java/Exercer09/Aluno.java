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
    public double[][] notasDisciplinas;
    private String nome;
    private String curso;
    private String matricula;
    private String [] nomeDisciplinas;
    private double [][] notaDisciplinas;

    public Aluno() {
        nomeDisciplinas = new String[3];
        notaDisciplinas = new double[3][4];
    }
    //this;para acessa a propria classe;
    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.nomeDisciplinas = new String[3];
        this.notaDisciplinas = new double[3][4];

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String[] getNomeDisciplinas() {
        return nomeDisciplinas;
    }

    public void setNomeDisciplinas(String[] nomeDisciplinas) {
        this.nomeDisciplinas = nomeDisciplinas;
    }

    public double[][] getNotaDisciplinas() {
        return notaDisciplinas;
    }

    public void setNotaDisciplinas(double[][] notaDisciplinas) {
        this.notaDisciplinas = notaDisciplinas;
    }
    public void mostrarinfo() {
        System.out.println("Nome: "+nome);
        System.out.println("Matricula: "+matricula);
        System.out.println("Nome do curso: "+curso);

        for(int i=0; i<notaDisciplinas.length; i++) {
            System.out.println("Notas da disciplina "+nomeDisciplinas[i]);
            for (int j=0; j<notaDisciplinas[i].length; j++) {
                System.out.println(notaDisciplinas[i][j] + " ");
            }
            System.out.println(" ");
        }
        }
    public boolean verificarAprovado(int indice) {
        if(obterMedia(indice) >= 7) {
            return true;
        }
        return false;
    }
    private double obterMedia(int indice) {
        double soma = 0;
        for(int i=0; i<notaDisciplinas[indice].length; i++) {
            soma += notaDisciplinas[indice][i];
        }
        double media = soma / 4;
        return media;
    }
    public void setNomeDisciplinaPos(int pos,String nomeDisciplina) {
        this.nomeDisciplinas[pos] = nomeDisciplina;
    }
    public void setNomePodIJ(int podI, int posJ, double nota) {
        this.notaDisciplinas[podI][posJ] = nota;
    }

    public void mostrarInfo() {
    }
}



