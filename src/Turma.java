import java.util.List;
import java.util.ArrayList;

public class Turma {
    private int codigo;
    private Disciplina disciplina;
    private Professor professor;
    private List<Aluno> alunos = new ArrayList<Aluno>();

    public Turma(int codigo, Disciplina disciplina, Professor professor, Aluno aluno){
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.professor = professor;
        this.alunos.add(aluno);
    }

    public int getCodigo() {
        return codigo;
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
        for(Aluno aluno : alunos){
            System.out.println(aluno);
        }
    }
}

