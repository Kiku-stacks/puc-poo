import java.util.ArrayList;

public class Cadastro {

	private ArrayList<String> nome;
	private ArrayList<String> matricula;
	private ArrayList<String> endereco;

	public Cadastro (){
		this.nome = new ArrayList<>();
		this.matricula = new ArrayList<>();
		this.endereco = new ArrayList<>();
	}

	public void cadastrarAluno(String nome, String matricula, String endereco){
		this.nome.add(nome);
		this.matricula.add(matricula);
		this.endereco.add(endereco);

	}

	public void buscarAluno(String matricula){
		this.matricula.contains(matricula);
	}


	public void imprimirMenu(){
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("|                                                   |");
		System.out.println("|         SISTEMA DE CADASTRO DE ALUNOS             |");
		System.out.println("|                                                   |");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("|                                                   |");
		System.out.println("|   1. Cadastrar Novo Aluno                         |");
		System.out.println("|   2. Consultar Aluno por Matrícula                |");
		System.out.println("|   3. Atualizar Dados do Aluno                     |");
		System.out.println("|   4. Excluir Aluno                                |");
		System.out.println("|   5. Buscar por Nome                              |");
		System.out.println("|   6. Buscar por Endereço                          |");
		System.out.println("|   0. Sair do Sistema                              |");
		System.out.println("|                                                   |");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.print("--> Digite a opção desejada: ");
	}

}
