package edu.paraCasa.aula16e17;

import java.util.Scanner;

public class ParaCasa19 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Digite a quantidade de notas ");
        int qtdNotas= scan.nextInt();

        double nota;
        double soma=0;
        double media;

        for(int i=1; i<=qtdNotas; i++){
            System.out.println("Digite a "+i+"° nota");
            nota= scan.nextInt();

            soma+=nota;
        }

        media = soma/qtdNotas;
        System.out.println("A média das notas é: "+media);

    }
}
