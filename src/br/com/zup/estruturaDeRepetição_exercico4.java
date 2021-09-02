package br.com.zup;

import java.util.Scanner;

public class estruturaDeRepetição_exercico4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int contador = 0;
        double media= 0;
        double soma= 0;


        System.out.println("Quantos números vezes você deseja calcular a média?");
        int numerosCalcular = leitor.nextInt();

        while(contador < numerosCalcular){
            System.out.println("Digite o número que você deseja calcular:");
            double numeroMedia = leitor.nextDouble();


           soma = soma + numeroMedia;
           contador++;
        }

        media = soma / numerosCalcular;

        System.out.println(media);
    }
}
