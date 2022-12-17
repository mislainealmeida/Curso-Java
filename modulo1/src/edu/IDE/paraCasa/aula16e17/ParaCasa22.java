package edu.paraCasa.aula16e17;

import java.util.Scanner;

public class ParaCasa22 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Informe a quantidade de CDs");
        int cd= scan.nextInt();

        double valor;
        double soma=0;
        double media;

        for(int i=0; i<cd; i++){
            System.out.println("Digite o valor do CD "+(i+1));
            valor=scan.nextDouble();

            soma+=valor;
        }
        media= soma/cd;
        System.out.println("Foi investido R$"+soma+" em "+cd+" CDs.");
        System.out.println("Uma média de R$"+media+" em cada CD.");
    }
}
