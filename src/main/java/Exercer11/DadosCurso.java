/* Questao 36.2; Escreva  uma  classe  para  representar  um  Curso,  que  tem
nome  e  horário.   Cada  curso  tem  um  Professor,  que  possui  nome,
departamento  e  email.   Cada  Curso  também  pode  ter  vários  alunos  (tipo
 Aluno).  Cada  Aluno  tem   nome,  matricula  e  4  notas.  Escreva  um
 programa  teste  que  crie  um  Curso   com  5  alunos,  e  que  preça  para
 o  usuário  entrar  com  as  4  notas  de  cada   aluno.  Ao  final,  imprima
   a  média  de  cada  aluno,  se  o  mesmo  está  aprovado   (media  maior  ou
igual  a  7),  e  qual  é  a  média  da  turma.
 */
package Exercer11;

public class DadosCurso {
    private String nome;
    private String horario;
    private DadosProfessor professor;
    private DadosAluno[] alunos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public DadosProfessor getProfessor() {
        return professor;
    }

    public void setProfessor(DadosProfessor professor) {
        this.professor = professor;
    }

    public DadosAluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(DadosAluno[] alunos) {
        this.alunos = alunos;
    }
    public String obterInfo(){
        String info = "Nome do Curso = "+nome+ "\n";

        if(professor != null) {
            info += professor.obterInfo();
        }
        if (alunos != null) {
            System.out.println(" ***** Alunos *******");
            for (DadosAluno aluno: alunos) {
                if (aluno != null) {
                    info += aluno.obterInfo();
                    info += "\n";
                }
            }
            info += "\nMedia da turma = " +obterMediaTurma();

        }
        return info;
    }
    public double obterMediaTurma(){
        double soma = 0;
        for (DadosAluno aluno: alunos) {
            if (aluno != null) {
                soma += aluno.obterMedia();
            }
        }
        return soma/alunos.length;
    }

}

