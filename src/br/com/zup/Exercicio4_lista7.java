package br.com.zup;

import java.util.Scanner;

public class Exercicio4_lista7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Faça um programa que leia n números inteiros positivos e calcule a soma desses números

        int contador = 0;
        int soma = 0;
        System.out.println("Vou te ajudar a somar");
        System.out.println("Quantas vezes vc quer calcular?");
        int qtdeNumero = leitor.nextInt();

        while (contador < qtdeNumero) {
            System.out.println("Digite um número :");
            int numeroUsuario = leitor.nextInt();

            if (numeroUsuario < 0) {
                System.out.println("Digite somente números positivos");
            } else {

                //operacao
                soma = soma + numeroUsuario;
                contador++;
            }
        }
        System.out.println("A soma dos números é " + soma);


    }
}

