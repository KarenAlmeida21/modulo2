package br;

import java.util.Scanner;

public class Aula3_Condicao3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Por favor, digite o valor do primeiro produto: ");
        float produto1 = leitor.nextFloat();

        System.out.println("Por favor, digite o valor do segundo produto: ");
        float produto2 = leitor.nextFloat();

        System.out.println("Por favor, digite o valor do terceiro produto; ");
        float produto3 = leitor.nextFloat();

        // se o produto 2 for mais barato
        if (produto1 < produto2 & produto1 < produto3) {
            System.out.println("O primeiro produto é mais barato ");
        }

            //se o produto 2 for mais barato
        else if (produto2 < produto1 & produto2 < produto3){
            System.out.println("O segundo produto é mais barato ");
        }

        // se o produto 3 for mais barato
        else if (produto3 < produto1 & produto3 < produto2){
            System.out.println("O terceiro produto é mais barato ");
        }

        // se forem iguais
        else {
            System.out.println("Os numeros são iguais");
        }



        }

    }

