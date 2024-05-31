public class Main {
    public static void main(String[] args) throws Exception {
        
        Disciplina disciplina1 = new Disciplina(0101, "Engenharia Softaware", 3);
        Disciplina disciplina2 = new Disciplina(0023, "Ciencias da Computacao", 5);
        Disciplina disciplina3 = new Disciplina(0121, "Analise e desenvolvimento de Sistemas", 1);

        Aluno aluno2 = new Regular("Erika", 21, "284.678.798-09", 129878);
        Aluno aluno3 = new Regular("Marcu", 39, "456.756.354-46", 768982);
        Aluno aluno1 = new Bolsista("Rafaela", 24, "891.234.543-89", 246578);

        Pessoa professor = new Professor("Roberto", 54, "534.476.345-36", "Primeiro - A");

        Pessoa visitante1 = new Visitante("Samir", 24, "465.567.982-28");
        Pessoa visitante2 = new Visitante("Sergio", 26, "354.716.932-01");
        Pessoa visitante3 = new Visitante("Waganer", 48, "180.981.378-10");

        Turma turma1 = new Turma(024, disciplina1, (Professor) professor);
        turma1.adcionarAluno(aluno1);
        turma1.adcionarAluno(aluno2);
        turma1.adcionarAluno(aluno3);
        Turma turma2 = new Turma(025, disciplina2, (Professor) professor);
        turma2.adcionarAluno(aluno1);
        turma2.adcionarAluno(aluno2);
        turma2.adcionarAluno(aluno3);
        Turma turma3 = new Turma(026, disciplina3, (Professor) professor);
        turma3.adcionarAluno(aluno1);
        turma3.adcionarAluno(aluno2);
        turma3.adcionarAluno(aluno3);

        System.out.printf("\n\nCodigo da turma: %d, Nome do doescente: %s, Nome da disciplina: %s\n", turma1.getCodigo(), turma1.exibirProfessor(), turma1.exibirDisciplina());
        turma1.listarAluno();

        System.out.printf("\n\nCodigo da turma: %d, Nome do doescente: %s, Nome da disciplina: %s\n", turma2.getCodigo(), turma2.exibirProfessor(), turma2.exibirDisciplina());
        turma2.listarAluno();
        
        System.out.printf("\n\n##Codigo da turma: %d, Nome do doescente: %s, Nome da disciplina: %s\n", turma3.getCodigo(), turma3.exibirProfessor(), turma3.exibirDisciplina());
        turma3.listarAluno();
    }
}
 