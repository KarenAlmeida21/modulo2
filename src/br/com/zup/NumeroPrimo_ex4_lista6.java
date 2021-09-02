package br.com.zup;

import java.util.Scanner;

public class NumeroPrimo_ex4_lista6 {
    public static void main(String[] args) {
        //4 - Os números primos possuem várias aplicações dentro da Computação, por exemplo na Criptografia.
        // Um número primo é aquele que é divisível apenas por um e por ele mesmo.
        // Faça um programa que peça um número inteiro e determine se ele é ou não um número primo.


        Scanner leitor = new Scanner(System.in);


        System.out.println("Digite um número e eu vou verificar se ele é primo ou não:");
        int numeroInformado = leitor.nextInt();

        int qtdeDivisel = 0;


        for (int calculo = 1; calculo <= numeroInformado; calculo++) {


            if (numeroInformado % calculo == 0) {
                qtdeDivisel++;

            }
        }
        if (qtdeDivisel == 2) {
            System.out.println("É primo");
        } else {
            System.out.println("Não é primo");
        }

            //main
        }
    }

