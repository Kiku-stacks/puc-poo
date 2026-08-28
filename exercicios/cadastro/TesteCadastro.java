package com.bruno.pucgo.exercicios.cadastro;

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
                        System.out.println("Informe a matricula do aluno para fazer a busca");
                        matricula = scan.nextLine();
                        cadastro.buscarAlunoMatricula(matricula);
                        break;
                    case 3:
                        System.out.println("Informe a matricula do aluno no qual deseja atualizar os dados");
                        matricula = scan.nextLine();
                        System.out.println("Informe o novo nome a ser atualizado ?");
                        nome = scan.nextLine();
                        System.out.println("Informe o novo endereco a ser atualizado");
                        endereco = scan.nextLine();
                        cadastro.alterarDadosAluno(matricula,nome,endereco);
                        break;

                    case 4:
                        System.out.println("Informe a matricula na qual deseja exluir os dados do aluno");
                        matricula = scan.nextLine();
                        cadastro.removerDadosAluno(matricula);
                        break;

                    case 5:
                        System.out.println("Informe o nome do aluno no qual deseja fazer a busca");
                        nome = scan.nextLine();
                        cadastro.buscarAlunoPorNome(nome);
                        break;

                    case 6:
                        System.out.println("Informe o endereço do aluno que deseja fazer a busca");
                        endereco = scan.nextLine();
                        cadastro.buscarAlunoPorEndereco(endereco);
                        break;

                    default:
                        System.out.println("Opção inválida, escolha uma de 1 a 6");
                        break;
                }
            }
        }
    }
}
