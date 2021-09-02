package br.com.zup;

import java.util.Scanner;

public class Atividade3_Variaveis_Scanner {
    public static void main(String[] args) {
        Scanner obj_leitor = new Scanner(System.in);
        float metros;
        float centimetros;
        System.out.println("Digite o número de metros que você deseja converter: ");
        metros = obj_leitor.nextFloat();
        centimetros = metros * 100;

        System.out.println(" A conversão dos metros informados é " + centimetros + " centimetros");
    }
}
