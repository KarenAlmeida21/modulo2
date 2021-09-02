package br.com.zup;

import java.util.Scanner;

public class Atividade5_Variaveis_Scanner {
    public static void main(String[] args) {
        Scanner obj_leitor = new Scanner(System.in);
        float fahrenheit;
        System.out.println(" Digite os graus em fahrenheit : ");
        fahrenheit = obj_leitor.nextFloat();

        float celsius = (fahrenheit - 32) / 1.8F;
        System.out.println( " A temperatura em graus Celsius é " + celsius);

    }
}
