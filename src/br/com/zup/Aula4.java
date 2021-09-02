package br.com.zup;

import java.util.Scanner;

public class Aula4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor do seu salário: ");

        double salarioAtual = leitor.nextDouble();
        double porcentagem=0;
        double novoSalario=0;






        if (salarioAtual > 0 & salarioAtual <= 280){
           // System.out.println( "Você recebeu um aumento de 20% ");
            porcentagem =  0.20;
        }

        else if (salarioAtual > 280 & salarioAtual <= 700 ) {
            //System.out.println("Você recebeu um aumento de 15 %");
            porcentagem = (0.15);
        }



        else if (salarioAtual > 700 &  salarioAtual <= 1500){
            //System.out.println("Você recebeu um aumento de 10%");
            porcentagem = (0.10);
        }

        else if (salarioAtual > 1500 ){
           // System.out.println("Você recebeu um aumento de 5%");
            porcentagem = (0.05);
        }

        else {
            System.out.println("Digite um valor valido");
        }

            double valorAumento = salarioAtual * porcentagem;
        novoSalario = salarioAtual + valorAumento;

       // informando o valor do salrio atual
        System.out.println(" Seu salário atual é R$ " + salarioAtual);

        //informando valor do aumento
        System.out.println(" O valor do seu aumento será de R$ " + valorAumento);

       //informando novo salario
        System.out.println(" Seu novo salário será de R$ " + novoSalario );

        // informando o valor da porcentagem
        System.out.println(" O porcentagem do seu aumento será de " + porcentagem + "%");


    }
}
