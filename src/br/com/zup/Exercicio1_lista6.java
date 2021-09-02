package br.com.zup;

import java.util.Scanner;

public class Exercicio1_lista6 {
    public static void main(String[] args) {
        //Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar,
        // sabendo que a decisão é sempre pelo mais barato.


        Scanner leitor= new Scanner(System.in);

        System.out.println("Informe o valor dos produtos e eu vou indicar o mais barato");
        System.out.println("Digite o valor do primeiro produto:");
        double produto1 = leitor.nextDouble();
        System.out.println("Digite o valor do segundo produto:");
        double produto2 = leitor.nextDouble();
        System.out.println("Digite o valor do terceiro produto:");
        double produto3 = leitor.nextDouble();

        if (produto1 < produto2 & produto1 < produto3){
            System.out.println("produto 1 é + barato");
        } else if (produto2 < produto1 & produto2 < produto3){
            System.out.println("O produto 2 é mais barato");
        } else {
            System.out.println("O produto 3 é mais barato");
        }







    }
}
