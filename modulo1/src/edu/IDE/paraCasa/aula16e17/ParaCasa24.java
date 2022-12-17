package edu.paraCasa.aula16e17;

import java.util.Scanner;

public class ParaCasa24 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Qual o valor do pão? ");
        double valor=scan.nextDouble();
        System.out.println("Preço do pão: R$"+valor);
        System.out.println("Panificafora Pão de Ontem - Tabela de preços");
        for (int i=1; i<=50; i++){
            System.out.println(i+" - R$"+(valor*i));
        }
    }
}
