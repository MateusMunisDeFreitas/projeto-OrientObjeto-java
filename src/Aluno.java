public class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, int idade, String cpf, String matricula){
        super(cpf, nome, idade);
        this.matricula = matricula;
    }
    
    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public void pagarMenssalidade(){}
    
}
