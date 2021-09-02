package br.com.zup;

import java.util.Scanner;

public class EstruturaDeRepeticao_exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int contador = 0;
        float soma = 0;
        float numeroRecebido = 0;

        System.out.println("Vou te ajudar a somar");



        while (contador < 5 ){
            System.out.println("Digite o número que vc deseja somar: ");
            numeroRecebido = leitor.nextFloat();
            contador ++;

            soma = soma + numeroRecebido;
            System.out.println(soma);
        }

    }

}
