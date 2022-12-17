package edu.paraCasa.aula18e19;

import java.util.Scanner;

public class ParaCasa17 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int[] idades= new int[10];
        int soma=0;

        for (int i=0; i <idades.length; i++){
            System.out.println("Qual a idade da pessoa "+(i+1));
            idades[i]= scan.nextInt();
        }
        System.out.println("");

        System.out.print("Idade: ");
        for (int i=0; i <idades.length; i++) {
            System.out.print(idades[i]+ " ");
        }
        System.out.println(" ");

        System.out.print("Idade maior que 35: ");
        for (int i=0; i<idades.length; i++){
            if(idades[i]>35) {
                soma++;
                System.out.print(idades[i]+" ");
            }
        }
        System.out.println("");
        System.out.println("Há "+soma+" pessoas com mais de 35 anos de idade.");
    }
}
