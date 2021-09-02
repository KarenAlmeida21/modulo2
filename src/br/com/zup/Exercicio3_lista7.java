package br.com.zup;

import java.util.Scanner;

public class Exercicio3_lista7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int maiorNum = 0;
        int menorNum = 0;
        int contador = 0;

        while (contador < 10) {
            System.out.println("Digite 10 numeros ");
            int numeroInt = leitor.nextInt();
            if (contador == 0) {
                menorNum = numeroInt;
                maiorNum = numeroInt;
            }
            if (maiorNum < numeroInt) {
                maiorNum = numeroInt;
            } else if (menorNum > numeroInt) {
                menorNum = numeroInt;
            }


            contador++;

        }
        System.out.println(maiorNum);
        System.out.println(menorNum);
    }


}

