package edu.paraCasa.aula11a13;

import java.util.Scanner;

public class ParaCasa8 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Quanto ganha por hora? ");
        double salarioHora = scan.nextDouble();
        System.out.println("Quantas horas trabalha por mês? ");
        double horasTrabalhadas = scan.nextDouble();

        double salarioTotal= salarioHora*horasTrabalhadas;
        System.out.println("Salário do mês: "+salarioTotal);

    }
}
