package com.bruno.poo_puc.semestre1.lista_classes;

import jdk.nashorn.internal.ir.CallNode;

import javax.sound.midi.Soundbank;

public class ContaBancariaSimplificada {

	private String nomeDoCorrentista;
	private double saldo;
	private boolean especial;
	private double limiteEspecial;

	public void abrirConta(String nome, double deposito, boolean especial) {
		this.nomeDoCorrentista = nome;
		this.especial = especial;

		if (deposito < 0) {
			System.out.printf("Erro, valor negativo não aceito para abertura de conta%n" +
					"Valor desejado: %f", deposito);
		} else {
			this.saldo = deposito;
		}
	}

	public void abrirContaSimples(String nome) {
		this.nomeDoCorrentista = nome;
		this.saldo = 0.0;
		this.especial = false;
	}

	public void depositar(double valor) {
		if(valor <= 0){
			System.out.println("Erro, depositos de valores negativos ou nulos não são aceitos");
		}else{
			System.out.printf("Deposito de R$: %.2f efetuado com sucesso%n",valor);
			this.saldo+=valor;
		}
	}

	public void sacar(double valor) {

		if(valor <= 0){
			System.out.println("Erro, saque de valores negativos ou nulos não são aceitos");
			return;
		}

		this.limiteEspecial = this.especial ? 20000.0 : 5000.0;

		if(valor <= this.limiteEspecial && valor <= this.saldo){
			System.out.printf("Saque de R$: %.2f efetuado com sucesso%n",valor);
			this.saldo-=valor;
		}else{
			System.out.println("Erro, saque de valores maior do que o limite especial ou do que o saldo atual não são aceitos");
		}
	}

	public void mostrarDados() {
		System.out.printf("O nome do correntista é: %s%nO saldo é: %f%n%s%n",
				this.nomeDoCorrentista,
				this.saldo,
				this.especial ? "A conta é especial" : "A conta é comum");
	}
}
