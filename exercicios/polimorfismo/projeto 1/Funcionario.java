package com.bruno.poo_puc.semestre1.polimorfismo.projeto_pt1;

public class Funcionario {
	private String nome;
	private String cpf;
	private String matricula;
	private String endereco;
	private double salario;

	public Funcionario(String nome, String cpf, String matricula, String endereco, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
		this.endereco = endereco;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String toString(){
		return "\nNome: " + nome +
				"\nCPF: " + cpf +
				"\nMatricula: " + matricula +
				"\nSalario: " + salario +
				"\nEndereco: " + endereco +
				"\nBonificacao: " + calcularBonificacao() +
				"\nSalario com bonificação: " + (salario + calcularBonificacao());
	}

	public double calcularBonificacao(){
		return 0.0;
	}
}
