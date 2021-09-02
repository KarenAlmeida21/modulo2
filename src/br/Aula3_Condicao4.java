package br;

import java.util.Scanner;

public class Aula3_Condicao4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //recebendo as notas
        System.out.println("Por favor, digite a primeira nota: ");
        float nota1 = leitor.nextFloat();

        System.out.println("Por favor, digite a segunda nota: ");
        float nota2 = leitor.nextFloat();

        //CALCULANDO A MEDIA
        float media;
        media = (nota1 + nota2) / 2;

        if(media > 7 & media < 10){
            System.out.println("Voce foi aprovado!");
        }
       else if (media < 7 & media > 0 ){
            System.out.println("Voce foi reprovado!");
        }
       else if (media == 10 ){
            System.out.println("Voce foi aprovado com distinção!");
        }
    }
}
