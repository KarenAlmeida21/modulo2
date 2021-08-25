package br.com.zup;

import java.util.Scanner;

public class Atividade2_Classes {
    public static void main(String[] args) {
       //instanciar o scanner
        Scanner obj_leitura = new Scanner(System.in);

        float nota1;
        float nota2;
        float nota3;
        float nota4;
        float somaDasnotas;
        float resultado;

        //receber valor das variaveis
        System.out.println(" Vou calcular a média aritmética das suas notas ");
        System.out.println("Por favor, digite a nota 1: ");
        nota1 = obj_leitura.nextFloat();
        System.out.println(" Por favor, digite a nota 2:");
        nota2 = obj_leitura.nextFloat();
        System.out.println(" Por favor, digite a nota 3:");
        nota3 = obj_leitura.nextFloat();
        System.out.println(" Por favor, digite a nota 4:");
        nota4 = obj_leitura.nextFloat();

        somaDasnotas = nota1 + nota2 + nota3 + nota4;
        resultado = somaDasnotas / 4;


       System.out.println(" A média aritmética é  " + resultado );




    }
}
