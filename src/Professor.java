public class Professor extends Pessoa {
    private String centro;
    
    public Professor(String nome, int idade, String cpf, String centro){
        super(cpf, nome, idade);
        this.centro = centro;
    }

    public String getCentro() {
        return centro;
    }
    
    public void setCentro(String centro) {
        this.centro = centro;
    }
    
    public void darAula(){
        System.out.println("Aula dada pelo professor " + super.getNome() + ", com formacao em " + this.getCentro());
    }
    
}
