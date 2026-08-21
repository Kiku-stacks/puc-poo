package com.bruno.pucgo.exercicios.aula_dia_18;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){


            String nome = scan.nextLine();
            String mensagemMotivacional = scan.nextLine();
            int anoNascimento = scan.nextInt();

            Mensagem.cabecalho();
            System.out.println("Olá " + nome + "A sua idade é: " + CalculaIdade.calcularIdade(2026,anoNascimento) + " anos");
            System.out.println("Esse são quantos segundos tem um dia: ");
            System.out.println(SegundosDia.calcularSegundosDia());
            System.out.println("Esse é a quantidade aproximada de segundos vividos por voce: " + calcularSegundosVividos(anoNascimento) + " segundos");
            System.out.print("Essa é a sua mensagem motivacional: ");
            Rodape.rodape(mensagemMotivacional);
        }
    }

    public static long calcularSegundosVividos(int anoNascimento){
        return (2026-anoNascimento)*365*86400L;
    }
}
