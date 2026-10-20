package com.bruno.poo_puc.semestre1.polimorfismo.projeto_pt1;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		Coordenador coord = new Coordenador("Xiquinha", "111.222.333-44", "C101", "Rua A, 123", 10000.0, "Coordenador");
		Diretor dir = new Diretor("Getulio Vargas", "555.666.777-88", "D202", "Av. B, 456", 20000.0, "Diretor");
		Presidente pres = new Presidente("Brasilicia das Dores", "999.888.777-66", "P303", "Alameda C, 789", 50000.0, "Presidente");

		List<Funcionario> funcionarios = new ArrayList<>();
		funcionarios.add(coord);
		funcionarios.add(dir);
		funcionarios.add(pres);

		for(Funcionario f : funcionarios){
			System.out.println(f.toString());
			System.out.printf("-----------------------");
		}
	}
}
