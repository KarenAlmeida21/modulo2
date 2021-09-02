package br.com.zup;

import java.util.Scanner;

public class Aula4_exercico1_lista3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);




        //Rceebendo dados
        System.out.println("Digite o valor da hora trabalhada :");
        double valorHora = leitor.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas");
        double qdeHorastrabalhadas = leitor.nextDouble();


        double impostoRenda=0;
        double salarioBruto = valorHora * qdeHorastrabalhadas;
        double inss = ( salarioBruto * 0.10);
        double fgts = (salarioBruto * 0.11);

        if (salarioBruto > 0 & salarioBruto <= 900){
            double porcentagem = 0;
             impostoRenda= 0;
            System.out.println(" A porcentagem paga para imposto de renda será de " + porcentagem + " % ");
         }

         else if (salarioBruto > 900 & salarioBruto <= 1500){
          double  porcentagem = 0.15;
             impostoRenda= salarioBruto * porcentagem;
         }

         else if (salarioBruto > 1500 & salarioBruto <= 2500){
             double porcentagem = 0.10;
             impostoRenda= salarioBruto * porcentagem;
         }
         else {
             double porcentagem = 0.20;
             impostoRenda = salarioBruto * porcentagem;
         }
        double totalDesconto = inss + impostoRenda;
        double salarioLiquido = salarioBruto - inss - impostoRenda;
        double porcentagemInss = 10;
        double porcentagemFgts = 11;





        System.out.println(" Salario Bruto  R$ " + "( " +  valorHora + " * " + qdeHorastrabalhadas + " )" + " : " + salarioBruto);
        System.out.println(" (-) IR " +  impostoRenda);
        System.out.println(" O seu desconto do inss será de R$ ( " + porcentagemInss + " % ) " + inss);
        System.out.println(" O valor pago ao fgts este mês será de R$ ( " + porcentagemFgts + " % ) " + fgts);
        System.out.println(" O total de desconto este mês será de R$ " + totalDesconto);
        System.out.println(" Seu salario liquido este mês será de R$ " + salarioLiquido);

         }
    }



