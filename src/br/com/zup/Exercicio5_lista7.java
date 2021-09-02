package br.com.zup;

import java.util.Scanner;

public class Exercicio5_lista7 {
    public static void main(String[] args) {

        int numeroDeclarado=0;
        int contador=0;

        while (numeroDeclarado < 100000){
            System.out.println(numeroDeclarado);
            contador += 1000;
            numeroDeclarado= contador;
            System.out.println(numeroDeclarado);


        }

    }
}
