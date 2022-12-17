package edu.paraCasa.aula14e15;

import java.util.Scanner;

public class ParaCasa21 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Gasolina ou álcool? (G-A) ");
        String combustivel= scan.next();
        System.out.println("Quantos litros? ");
        double litros= scan.nextDouble();
        double g=2.50;
        double a=1.90;
        double total=0;
        int percentual=0;

        if(combustivel.equalsIgnoreCase("g")){
            total= g*litros;
            if(litros<=20){
                percentual=4;
               System.out.println("4% de desconto");
           }else{
                percentual=6;
               System.out.println("6% de desconto");
           }
        }else if(combustivel.equalsIgnoreCase("a")){
            total= a*litros;
            if(litros<=20){
                percentual=3;
                System.out.println("3% de desconto");
            }else{
                percentual=5;
                System.out.println("5% de desconto");
            }
        }


        double desconto= total * percentual/100;
        double totalPagar= total - desconto;
        System.out.println("Combustível: "+combustivel);
        System.out.println("Litros: "+litros+"L");
        System.out.println("Total: R$"+total);
        System.out.println("Desconto: R$"+desconto);
        System.out.println("Total a pagar: R$"+totalPagar);
    }
}
