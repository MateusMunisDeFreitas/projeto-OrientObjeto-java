# Projeto de Orientação a Objeto com JAVA

## Descrição de projeto:

● Questão 1: Classes e Objetos: Crie uma classe abstrata chamada 
“Pessoa” que represente um ser humano. Pessoa deve ter atributos 
como “cpf”, “nome” e “idade”. Implemente os métodos para definir e 
obter esses atributos. Crie uma classe “Disciplina” com os atributos 
como “codigo”, “nome” e “semestre”.
● Questão 2: Encapsulamento e Métodos: Evolua a classe “Pessoa”
adicionando um método público para incrementar a idade da 
pessoa. Crie um método público chamado “fazerAniversario”.
● Questão 3: Herança e Polimorfismo: Crie 3 classes derivadas de
“Pessoa”, são elas: “Visitante”, “Aluno” e “Professor”. Adicione um
atributo “matrícula” para a classe “Aluno” e um método
“pagarMensalidade”. Adicione um atributo “centro” para a classe
“Professor” e um método “darAula”. Crie 2 classes derivadas de
“Aluno”, são elas: “Bolsista” e “Regular” e faça uma sobreposição no
método “pagarMensalidade” para ambas as classes.
● Questão 4: Associação e Composição: Crie uma classe, chamada 
“Turma”. Adicione em turma os atributos “código”, “disciplina”, 
“professor” e “alunos”, crie os métodos “adicionarAluno”, 
“removerAluno” e “listarAlunos” e os implemente utilizando ArrayList. 
Cada atributo será do tipo da classe de mesmo nome, exceto alunos 
que terá uma lista de objetos do tipo “Aluno”.
● Crie uma classe com método main onde você deverá instanciar:
- 3 objetos de disciplina;
- 3 objetos aluno (2 regulares e 1 bolsista);
- 1 objeto professor;
- 2 objetos visitante;
- 3 objetos turma, contendo todos os alunos, o professor e 1 
disciplina em cada turma criada;
• Imprima na tela a informação de cada turma, seu código, o professor, 
a disciplina e a lista de alunos matriculados na turma.


## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

# projeto-OrientObjeto-java
