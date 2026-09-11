package com.bruno.poo_puc.semestre1.lista_classes;

public class TesteContaBancaria {

	public static void main(String[] args) {

		ContaBancariaSimplificada conta = new ContaBancariaSimplificada();

		conta.abrirConta("Bruno",1000.0,true);
		conta.depositar(5000);
		conta.sacar(3000);
		conta.mostrarDados();
	}
}
