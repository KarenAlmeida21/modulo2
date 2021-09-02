package br.com.zup;

import java.util.Scanner;

public class Aula4_exercicio4_lista3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        int contadorResposta=0;

        System.out.println(" Sou agente do FBI");

        System.out.println(" Vou te fazer algumas perguntas");
        System.out.println("                               ");
        System.out.println(" Responda com S ou N");
        System.out.println("                               ");

//fazendo as perguntas
        System.out.println(" Telefonou para a vitima?" );
       String  resposta = leitor.nextLine();
        if (resposta.equals("S")| resposta.equals("s")){
            contadorResposta = contadorResposta +1;
        }

        System.out.println("Esteve no local do crime?");
        resposta  = leitor.nextLine();
        if (resposta.equals("S")| resposta.equals("s")){
            contadorResposta = contadorResposta +1;
        }

        System.out.println("Mora perto da vítima?");
        resposta = leitor.nextLine();
        if (resposta.equals("S")| resposta.equals("s")){
            contadorResposta = contadorResposta +1;
        }

        System.out.println("Devia para a vítima");
        resposta = leitor.nextLine();
        if (resposta.equals("S")| resposta.equals("s")){
            contadorResposta = contadorResposta +1;
        }

        System.out.println("Já trabalhou com a vítima");
        resposta = leitor.nextLine();
        if (resposta.equals("S")| resposta.equals("s")){
            contadorResposta = contadorResposta +1;
        }
        switch (contadorResposta){
            case 2:
                System.out.println(" Você é suspeito.");
                break;
            case 3:
                System.out.println(" Você é cumplice.");
                break;
            case 4:
                System.out.println(" Você é cumplice.");
                break;
            case 5:
                System.out.println(" Você é o assassino.");
                break;
            default:
                System.out.println(" Você é inocente.");
                break;
        }



    }
}
