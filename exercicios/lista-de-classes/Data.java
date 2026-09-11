package com.bruno.poo_puc.semestre1.lista_classes;

import java.util.Scanner;

public class Data {
	private int dia;
	private int mes;
	private int ano;

	public void ehValida() {
		if (this.mes < 1 || this.mes > 12) {
			if (this.ano % 4 == 0 && this.ano % 100 != 0 && this.ano % 400 == 0) {
				if ((this.dia < 0 || this.dia > 31) && (this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7 || this.mes == 8 || this.mes == 10 || this.mes == 12)) {
					System.out.print("Data valida!!");
				} else {
					if ((this.dia < 0 || this.dia > 30) && (this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11)) {
						System.out.print("Data valida!!");
					} else {
						if ((this.dia < 0 || this.dia > 29) && this.mes == 2) {
							System.out.print("Data valida!!");
						} else {
							System.out.print("Data inválida!!");
						}
					}
				}
			} else {
				if ((this.dia < 0 || this.dia > 31) && (this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7 || this.mes == 8 || this.mes == 10 || this.mes == 12)) {
					System.out.print("Data valida!!");
				} else {
					if ((this.dia < 0 || this.dia > 30) && (this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11)) {
						System.out.print("Data valida!!");
					} else {
						if ((this.dia < 0 || this.dia > 28) && this.mes == 2) {
							System.out.print("Data valida!!");
						} else {
							System.out.print("Data inválida!!");
						}
					}
				}
			}
		} else {
			System.out.print("Data inválida!!");
		}
	}

	public void inicializaData(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public boolean vemAntes(int dia2, int mes2, int ano2) {
		if (this.ano < ano2) {
			return true;
		} else {
			if (this.ano > ano2) {
				return false;
			} else {
				if (this.mes < mes2) {
					return true;
				} else {
					if (this.mes > mes2) {
						return false;
					} else {
						if (this.dia < dia2) {
							return true;
						} else {
							if (this.dia > dia2) {
								return false;
							} else {
								return true;
							}
						}
					}
				}
			}
		}
	}
}
