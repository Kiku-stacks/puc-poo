package com.bruno.poo_puc.semestre1.polimorfismo.projeto_pt1;

public class Coordenador extends Funcionario{
	private String cargo;

	public Coordenador(String nome, String cpf, String matricula, String endereco, double salario, String cargo){
		super(nome, cpf, matricula, endereco, salario);
		this.cargo = cargo;
	}

	@Override
	public double calcularBonificacao(){
		return super.getSalario()*0.10;
	}

	public double getSalarioFinal(){
		return getSalario() + calcularBonificacao();
	}

	@Override
	public String toString(){
		String resultado;
		resultado = super.toString() + "\n";
		resultado += "Cargo: " + cargo;
		return resultado;
	}
}
