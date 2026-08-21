package com.bruno.pucgo.exercicios.aula_dia_18;

import java.util.Scanner;

public class Rodape {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String mensagemMotivacional = scan.nextLine();
        rodape(mensagemMotivacional);

    }

    public static void rodape(String msg){
        System.out.println("********** " + msg + " **********");
    }
}
