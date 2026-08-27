import java.util.Scanner;

public class TesteCadastro {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {

			Cadastro cadastro = new Cadastro();

			while (true) {
				cadastro.imprimirMenu();

				String nome;
				String endereco;
				String matricula;
				int opcao = scan.nextInt();
				scan.nextLine();

				if(opcao == 0){
					break;
				}

				switch(opcao){
					case 1:
						System.out.println("Digite os dados do aluno:");
						System.out.println("Nome:");
						nome = scan.nextLine();

						System.out.println("Matricula:");
						matricula = scan.nextLine();

						System.out.println("Endereco:");
						endereco = scan.nextLine();

						cadastro.cadastrarAluno(nome,matricula,endereco);
						break;

					case 2:
						break;

				}
			}
		}
	}
}
