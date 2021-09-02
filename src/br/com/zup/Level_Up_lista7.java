package br.com.zup;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Level_Up_lista7 {
    public static void main(String[] args) {


        //Faça um programa que some os números ímpares contidos em um intervalo definido pelo usuário.
        // O usuário define o valor inicial do intervalo e o valor final deste intervalo
        // e o programa deve somar todos os números ímpares contidos neste intervalo. Caso o usuário digite
        // um intervalo inválido (começando por um valor maior que o valor final)
        // deve ser escrito uma mensagem de erro na tela, “Intervalo de valores inválido” e o programa termina.


        Scanner leitor = new Scanner(System.in);
        double soma = 0;


        System.out.println("Digite um valor inicial de um intervalo e um valor final de um intervalo");
        System.out.println(" E eu vou vou descobrir quantos números ímpares compõem ele e vou somar esses números pra vc");
        System.out.println("Digite o valor inicial:");
        double valorInicial = leitor.nextDouble();
        System.out.println("Digite o  valor final:");
        double valorFinal = leitor.nextDouble();


        while (valorInicial <= valorFinal) {


           // double numeroIntervalo = valorInicial + contador;

            if (valorInicial % 2!=0) {
                soma = soma + valorInicial;

            }
            valorInicial++;


        }
        System.out.println(soma);


    }


}




