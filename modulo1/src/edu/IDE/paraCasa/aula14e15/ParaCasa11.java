package edu.paraCasa.aula14e15;

import java.util.Scanner;

public class ParaCasa11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o seu salário atual ");
        double salario = scan.nextDouble();
        double aumento;
        int percentual;

        if(salario<=280){
             percentual=20;
             aumento= salario * percentual/100;
        } else if (salario >280 && salario <=700) {
             percentual=15;
             aumento= salario*percentual/100;
        } else if (salario>700 && salario <=1500) {
             percentual=10;
             aumento = salario*percentual/100;
        }else{
            percentual=5;
            aumento= salario*percentual/100;
        }

        double novoSalario= salario + aumento;

        System.out.println("Salário atual: R$"+salario);
        System.out.println("Reajuste: R$"+aumento);
        System.out.println("Percentual: "+percentual+"%");
        System.out.println("Novo salário: R$"+novoSalario);

    }
}
