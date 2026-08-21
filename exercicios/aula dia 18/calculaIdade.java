package com.bruno.pucgo.exercicios.aula_dia_18;

import java.util.Scanner;

public class CalculaIdade {

    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){

            int anoAtual = scan.nextInt();
            int anoNascimento = scan.nextInt();

            System.out.println(calcularIdade(anoAtual,anoNascimento));
        }
    }

    public static int calcularIdade(int anoAtual, int anoNascimento){

        return anoAtual-anoNascimento;
    }
}
