package com.bruno.poo_puc.semestre1.lista_classes;

public class Contador {
	private int cont;

	public void incrementar(){
		this.cont++;
	}

	public void zerar(){
		this.cont = 0;
	}

	public void decrementar(){
		this.cont--;
	}

	public void imprimir(){
		System.out.println(cont);
	}
}
