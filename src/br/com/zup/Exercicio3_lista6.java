package br.com.zup;

import java.util.Scanner;

public class Exercicio3_lista6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número para que eu possa gerar a tabuada:");
        int tabuadaEscolhido = leitor.nextInt();

        int resultado=0;


        for (int calculo=1; calculo <= 10; calculo++){
            resultado = tabuadaEscolhido * calculo;

            System.out.println(tabuadaEscolhido + " X " + calculo + " = " + resultado);

        }









        //main
    }
}
