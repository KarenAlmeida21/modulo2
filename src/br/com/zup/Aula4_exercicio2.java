package br.com.zup;

import java.util.Scanner;

public class Aula4_exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println(" Digite o numero correspondente ao dia que voce deseja: ");
        System.out.println(" 1- Domingo" );
        System.out.println(" 2- Segunda");
        System.out.println(" 3- Terça");
        System.out.println(" 4- Quarta");
        System.out.println(" 5- Quinta");
        System.out.println(" 6- Sexta");
        System.out.println(" 7- Sabado");



        int diaEscolhido = leitor.nextInt();




        switch (diaEscolhido){
            case 1:
                System.out.println(" O dia escolhido foi domingo");
                        break;
            case 2:
                System.out.println(" O dia escolhido foi segunda");
                        break;
            case 3:
                System.out.println(" O dia escolhido foi terça");
                        break;
            case 4:
                System.out.println(" O dia escolhido foi quarta");
                        break;
            case 5:
                System.out.println(" O dia escolhido foi quinta");
                        break;
            case 6:
                System.out.println(" O dia escolhido foi sexta");
                        break;
            case 7:
                System.out.println(" O dia escolhido foi sabado");
                break;
            default:
                System.out.println(" Digite um valor válido");
        }
    }
}
