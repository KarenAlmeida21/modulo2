package br.com.zup;

import java.util.Scanner;

public class Exemplo1_Variaveis_Scanner {
    public static void main(String[] args) {
        Scanner obj_leitor = new Scanner(System.in);
        int idadeDousuario;
        String nomeDousuario;
        System.out.println("Digite sua idade: ");
        idadeDousuario = obj_leitor.nextInt();
        System.out.println(" Digite seu nome: ");
        nomeDousuario = obj_leitor.next();


        //System.out.println(nomeDousuario);//
        //concatenando//
       System.out.println (" Seu nome é " + nomeDousuario + " e você tem " + idadeDousuario + " anos. ");
    }
}