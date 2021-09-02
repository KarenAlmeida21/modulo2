package br.com.zup;

import java.util.Scanner;

public class Exercicio2_lista7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int contador = 0;
        double soma = 0;

        System.out.println("Quantos números vc quer calcular: ");
        int qtdeNumero = leitor.nextInt();

        while (contador < qtdeNumero) {
            System.out.println("Digite um número inteiro:");
            int numeroInteiro = leitor.nextInt();
            //operação
            soma = soma + numeroInteiro;
            contador = contador + 1;

        }

        Double media = soma / qtdeNumero;
        System.out.println(media);


    }
}
