package br.com.zup;

import java.util.Scanner;

public class Aula4_exercicio2_lista3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //variaveis
        String tipoCombustivel;

        //Recebendo os dados
        System.out.println(" ****                 Posto de Combustíveis  Blá Blá Blá            **** ");
        System.out.println(" Digite a quantidade de litros de combustível que você deseja abastecer: ");
        double qtdeCombustivel = leitor.nextDouble();
        System.out.println("      Você irá abastecer " + qtdeCombustivel + " de combustivel");

        System.out.println("               Digite o combustível selecionado sendo:                   ");
        System.out.println("                        A para Alcool                                    ");
        System.out.println("                        G para Gasolina                                  ");
        tipoCombustivel = leitor.next();

        //operaçao com gasolina com 4% de desconto
        if (tipoCombustivel.equals("G") | tipoCombustivel.equals("g")) {

            System.out.println("Você escolheu gasolina");

            double valorCombustivelSemdesconto = qtdeCombustivel * 2.50;

            if (qtdeCombustivel <= 20 & qtdeCombustivel > 0) {
                double desconto20l = valorCombustivelSemdesconto / 100 * 4;
                double valorCombustivelComdesconto = valorCombustivelSemdesconto - desconto20l;
                System.out.println(" O valor do combustível sem desconto será de R$ " + valorCombustivelSemdesconto);
                System.out.println(" O valor do seu desconto será de R$ " + desconto20l);
                System.out.println(" O valor do seu combustível com desconto será de R$ " + valorCombustivelComdesconto);
            }
        }

        if (tipoCombustivel.equals("G") | tipoCombustivel.equals("g")) {

            if (qtdeCombustivel > 20) {
                double valorCombustivelSemdesconto = qtdeCombustivel * 2.50;
                double descontoMaior20l = valorCombustivelSemdesconto / 100 * 6;
                double valorCombustivelComdesconto2 = valorCombustivelSemdesconto - descontoMaior20l;
                System.out.println(" O valor do seu combustível sem desconto será de R$ " + valorCombustivelSemdesconto);
                System.out.println(" O valor do seu desconto será de R$  " + descontoMaior20l);
                System.out.println(" o valor do seu combustivel com desconto será de R$ " + valorCombustivelComdesconto2);
            }
        }

        if (tipoCombustivel.equals("A") | tipoCombustivel.equals("a")) {
            System.out.println("Você escolheu alcool");

            double valordoCombustivelSemdesconto = qtdeCombustivel * 1.90;

            if (qtdeCombustivel <= 20 & qtdeCombustivel > 0) {
                double desconto20l = valordoCombustivelSemdesconto / 100 * 3;
                double valorCombustivelComdesconto = valordoCombustivelSemdesconto - desconto20l;
                System.out.println(" o valor do seu combustivel sem desconto será de R$ " + valordoCombustivelSemdesconto);
                System.out.println(" O valor do seu desconto será de R$  " + desconto20l);
                System.out.println(" O valor do seu combustivel com desconto será de R$ " + valorCombustivelComdesconto);
            }

            if (qtdeCombustivel > 20) {
                double descontoMaior20l = valordoCombustivelSemdesconto / 100 * 5;
                double valorCombustivelComdesconto2 = valordoCombustivelSemdesconto - descontoMaior20l;
                System.out.println(" O valor do seu combustível será de R$ " + valordoCombustivelSemdesconto);
                System.out.println(" O valor do seu desconto será de R$ " + descontoMaior20l);
                System.out.println(" O valor do seu combustível será de R$ " + valorCombustivelComdesconto2);
            }


        }


    }


}