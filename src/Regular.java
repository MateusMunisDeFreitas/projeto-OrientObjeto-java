public class Regular extends Aluno{
    
    public Regular(String nome, int idade, String cpf, String matricula){
        super(nome, idade, cpf, matricula);
    }

    @Override
    public void pagarMenssalidade(){
        System.out.println(super.getNome() + "é aluno regular, mensalidade paga.");
    }
}
