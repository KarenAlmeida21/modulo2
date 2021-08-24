package br.com.zup;

public class Exercicio6_Classes {
    public static void main(String[] args) {
        float salarioHora = 9.09F;
        float qhorasmensais = 160F;
        float salarioBruto = salarioHora * qhorasmensais;
        System.out.println(" Seu salário bruto é R$" + salarioBruto);
        float descontoImposto = (float) (0.11 * salarioBruto);
        System.out.println(" O desconto do imposto de renda será o valor de R$ " + descontoImposto);
        float descontoInss = (float) (0.08 * salarioBruto);
        System.out.println(" O desconto do inss será o valor de R$ " + descontoInss);
        float descontosindicato = (float) (0.05 * salarioBruto);
        System.out.println( " O desconto do sindicato será o valor de R$" + descontosindicato);
        float salarioLiquido = (float) (salarioBruto- descontosindicato - descontoImposto - descontoInss);
        // termino do exercicio//
        System.out.println(" Seu salário líquido será o valor de R$ " + salarioLiquido);

    }
}
