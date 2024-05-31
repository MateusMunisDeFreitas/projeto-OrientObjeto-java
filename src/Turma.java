import java.util.List;
import java.util.ArrayList;

public class Turma {
    private int codigo;
    private Disciplina disciplina;
    private Professor professor;
    private List<Aluno> alunos = new ArrayList<Aluno>();

    public Turma(int codigo, Disciplina disciplina, Professor professor){
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.professor = professor;
    }
    public int getCodigo() {
        return this.codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void adcionarAluno(Aluno aluno){
        this.alunos.add(aluno);
    }
    public void removerAluno(Aluno aluno){
        this.alunos.remove(aluno);
    }
    public void listarAluno(){
        for(Aluno aluno : this.alunos){
            System.out.printf("Aluno: %s, idade: %d, cpf: %s, matricula: %d \n", aluno.getNome(), aluno.getIdade(), aluno.getCpf(), aluno.getMatricula());
        }
    }
    public String exibirProfessor(){
        return this.professor.getNome();
    }
    public String exibirDisciplina(){
        return this.disciplina.getNome();
    }
}

