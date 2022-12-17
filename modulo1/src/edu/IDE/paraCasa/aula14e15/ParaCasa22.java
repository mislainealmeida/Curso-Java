package edu.paraCasa.aula14e15;

import java.util.Scanner;

public class ParaCasa22 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Quantos Kg de morango? ");
        double pesoMorango= scan.nextDouble();
        System.out.println("Quantos Kg de maçã? ");
        double pesoMaca=scan.nextDouble();
        double pesoTotal=pesoMorango+pesoMaca;

        double precoMorango=0;
        double precoMaca=0;

        if(pesoMorango<=5){
            precoMorango= pesoMorango * 2.50;
        }else {
            precoMorango = pesoMorango * 2.20;
        }

        if(pesoMaca<=5){
            precoMorango= pesoMaca * 1.80;
        }else {
            precoMorango = pesoMaca * 1.50;
        }
        double precoTotalMorango= pesoMorango*precoMorango;
        double precoTotalMaca= pesoMaca*precoMaca;
        double precoParcial= precoTotalMaca+precoTotalMorango;
        double precoTotal=precoParcial;

        if(pesoTotal >=8 || precoParcial>25){
            precoTotal= precoTotal- ((precoParcial*10)/100);
        }


        System.out.println("Peso maçã: "+pesoMaca+"Kg");
        System.out.println("Valor Maçã: R$"+precoMaca);
        System.out.println("Peso morango: "+pesoMorango+"Kg");
        System.out.println("Valor Morango: R$"+precoMorango);
        System.out.println("Peso Total: R$"+pesoTotal+"Kg");
        System.out.println("Valor Total: R$"+precoTotal);



    }
}
