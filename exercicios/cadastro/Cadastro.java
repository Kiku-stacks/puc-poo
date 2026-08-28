package com.bruno.pucgo.exercicios.cadastro;

import java.util.ArrayList;

public class Cadastro {

    private ArrayList<String> nome;
    private ArrayList<String> matricula;
    private ArrayList<String> endereco;

    public Cadastro() {
        this.nome = new ArrayList<>();
        this.matricula = new ArrayList<>();
        this.endereco = new ArrayList<>();
    }

    private int obterIndicePorMatricula(String matricula) {
        if (this.matricula.isEmpty()) {
            System.out.println("A lista de cadastro está vazia");
            return -1;
        }

        if (!this.matricula.contains(matricula)) {
            System.out.println("Matricula não encontrada");
            return -1;
        }
        return this.matricula.indexOf(matricula);
    }

    public void cadastrarAluno(String nome, String matricula, String endereco) {
        if (!this.matricula.contains(matricula)) {
            this.nome.add(nome);
            this.matricula.add(matricula);
            this.endereco.add(endereco);
        } else {
            System.out.println("Já existe um aluno com essa matricula, por favor, escolha outra!");
        }
    }

    public void buscarAlunoMatricula(String matricula) {

        int index = obterIndicePorMatricula(matricula);

        if (index != -1) {
            System.out.printf("Aluno encontrado.%nNome: %s%nMatricula: %s%nEndereco:%s%n",
                    this.nome.get(index),
                    this.matricula.get(index),
                    this.endereco.get(index));
        }
    }

    public void buscarAlunoPorEndereco(String endereco) {
        if (this.endereco.isEmpty()) {
            System.out.println("A lista de cadastro está vazia");
            return;
        }

        boolean encontrou = false;

        for (int i = 0; i < this.endereco.size(); i++) {

            if (this.endereco.get(i).equalsIgnoreCase(endereco)) {
                System.out.printf("Aluno encontrado:%nMatrícula: %s%nNome: %s%nEndereço: %s%n-------------------%n",
                        this.matricula.get(i),
                        this.nome.get(i),
                        this.endereco.get(i));
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum aluno foi encontrado no endereco informado");
        }
    }

    public void buscarAlunoPorNome(String nome) {
        if (this.nome.isEmpty()) {
            System.out.println("A lista de cadastro está vazia");
            return;
        }

        boolean encontrou = false;

        for (int i = 0; i < this.nome.size(); i++) {

            if (this.nome.get(i).equalsIgnoreCase(nome)) {
                System.out.printf("Aluno encontrado:%nMatrícula: %s%nNome: %s%nEndereço: %s%n-------------------%n",
                        this.matricula.get(i),
                        this.nome.get(i),
                        this.endereco.get(i));
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum aluno foi encontrado com o nome informado");
        }

    }

    public void removerDadosAluno(String matricula) {

        int index = obterIndicePorMatricula(matricula);

        if (index != -1) {
            this.nome.remove(index);
            this.matricula.remove(index);
            this.endereco.remove(index);
            System.out.println("Aluno removido com sucesso !");
        }
    }

    public void alterarDadosAluno(String matricula, String novoNome, String novoEndereco) {

        int index = obterIndicePorMatricula(matricula);

        if (index != -1) {
            this.nome.set(index, novoNome);
            this.endereco.set(index, novoEndereco);
            System.out.println("Dados atualizados com sucesso !");
        }
    }


    public void imprimirMenu() {
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
