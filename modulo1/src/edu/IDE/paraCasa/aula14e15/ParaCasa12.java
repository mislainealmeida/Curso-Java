package edu.paraCasa.aula14e15;

import java.util.Scanner;

public class ParaCasa12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor da sua hora: ");
        double valorHora = scan.nextDouble();
        System.out.println("Digite a quantidade de horas trabalhadas: ");
        double horasTrabalhadas= scan.nextDouble();

        double salarioBruto = valorHora*horasTrabalhadas;
        double impostoRenda;
        double sindicato= salarioBruto*3/100;
        double FGTS= salarioBruto*11/100;

        if(salarioBruto<=900){
            impostoRenda= 0;
        } else if (salarioBruto<=1500) {
            impostoRenda= salarioBruto*5/100;
        } else if (salarioBruto<=2500) {
            impostoRenda= salarioBruto*10/100;
        }else{
            impostoRenda=salarioBruto*20/100;
        }

        double salarioLiquido= salarioBruto-sindicato-impostoRenda;

        System.out.println("Salário Bruto: R$"+salarioBruto);
        System.out.println("Imposto de Renda: R$"+impostoRenda);
        System.out.println("Sindicato: R$"+sindicato);
        System.out.println("FGTS: R$"+FGTS);
        System.out.println("Salário Líquido: R$"+salarioLiquido);

    }
}

