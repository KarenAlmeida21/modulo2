package br.com.zup;

import java.util.Scanner;

public class Exercicio2_lista6 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        //Faça um Programa que leia um número e exiba o dia correspondente da semana.
        // (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido.


        System.out.println("1- Domingo");
        System.out.println("2- Segunda");
        System.out.println("3- Terça");
        System.out.println("4- Quarta");
        System.out.println("5- Quinta");
        System.out.println("6- Sexta");
        System.out.println("7- Sabado");


        System.out.println("Escolha o número referente ao dia escolhido:");
        int diaEscolhido = leitor.nextInt();


        switch (diaEscolhido){
            case 1 :
                System.out.println("Você escolheu Domingo");
                    break;
            case 2 :
                System.out.println("Você escolheu Segunda");
                break;
            case 3 :
                System.out.println("Você escolheu Terça");
                break;
            case 4 :
                System.out.println("Você escolheu Quarta");
                break;
            case 5 :
                System.out.println("Você escolheu Quinta");
                break;
            case 6 :
                System.out.println("Você escolheu Sexta");
                break;
            case 7 :
                System.out.println("Você escolheu Sabado");
                break;

        }


    }
}
