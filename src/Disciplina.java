// Q1 (continuação): Crie uma classe “Disciplina” com os atributos
//como “codigo”, “nome” e “semestre”.
public class Disciplina {
    private int codigo;
    private String nome;
    private int semestre;

    public Disciplina(int codigo, String nome, int semestre) {
        this.codigo = codigo;
        this.nome = nome;
        this.semestre = semestre;
    }
// getters e setters das disciplinas
    public int getCodigo() {
        return this.codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getSemestre() {
        return this.semestre;
    }
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

}
