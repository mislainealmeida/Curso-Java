package edu.paraCasa.aula11a13;

import java.util.Scanner;

public class ParaCasa13 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Quanto ganha por hora? ");
        double salarioHora = scan.nextDouble();
        System.out.println("Quantas horas trabalha por mês? ");
        double horasTrabalhadas = scan.nextDouble();

        double salarioBruto= salarioHora*horasTrabalhadas;
        double impostoRenda= (salarioBruto/100) * 11;
        double inss= (salarioBruto/100)*8;
        double sindicato= (salarioBruto/100)*5;
        double salarioLiquido = salarioBruto - impostoRenda - inss-sindicato;

        System.out.println("Salário bruto: "+salarioBruto);
        System.out.println("Imposto de renda: "+impostoRenda);
        System.out.println("INSS: "+inss);
        System.out.println("Sindicato: "+sindicato);
        System.out.println("Salário líquido: "+salarioLiquido);

    }
}
