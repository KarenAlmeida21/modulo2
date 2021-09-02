package br.com.zup;

import java.util.Scanner;

public class Refazendo_lista7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int contador=0;
        int soma=0;
        double media=0;
        System.out.println("Quantas vezes vc quer calcular?");
        int qtdeNumero = leitor.nextInt();

       while(contador < qtdeNumero ){ System.out.println("Digite um número inteiro:");
        int numeroInt = leitor.nextInt();

        //operacao
           soma = soma + numeroInt;
           contador ++;
       }

       media= soma/qtdeNumero;
        System.out.println(media);
    }
}
