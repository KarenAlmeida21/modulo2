package br.com.zup;

import java.util.Scanner;

public class LaçosDeRepetiçao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int contador = 0;
        int numerosPares=0;
        int numerosImpares=0;

        //Recebendo dados do usuario
        System.out.println("Digite um número que eu vou te mostrar os números pares e impares que compõem este número:");
        int numeroDigitado = leitor.nextInt();

        while (contador <= numeroDigitado) {
            System.out.println("Por favor, digite o n:");
            int numeroUsuario = leitor.nextInt();
            if (numeroUsuario % 2 == 0) {
                numerosPares +=1;

            } else {
                numerosImpares +=1;


            }
            contador++;
        }

        System.out.println(" Estes são os números impares " + numerosImpares);
        System.out.println("Estes são os números pares " + numerosPares);
    }
}
