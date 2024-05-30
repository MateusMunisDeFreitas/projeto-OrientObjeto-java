public class Bolsista extends Aluno {
    
    public Bolsista(String nome, int idade, String cpf, String matricula){
        super(nome, idade, cpf, matricula);
    }

    @Override
    public void pagarMenssalidade(){
        System.out.println(super.getNome() + "é aluno bolsista, isento da mensalidade.");
    }
}
