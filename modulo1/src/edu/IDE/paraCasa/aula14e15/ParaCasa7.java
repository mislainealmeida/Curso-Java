package edu.paraCasa.aula14e15;

import java.util.Scanner;

public class ParaCasa7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o primeiro valor: ");
        double valor1 = scan.nextDouble();
        System.out.println("Entre com o segundo valor: ");
        double valor2 = scan.nextDouble();
        System.out.println("Entre com o terceiro valor: ");
        double valor3 = scan.nextDouble();

        if(valor1>valor2 && valor1>valor3){
            System.out.println("Número maior: "+valor1);
        }else if(valor2>valor1 && valor2>valor3){
            System.out.println("Número maior: "+valor2);
        }else{
            System.out.println("Número maior: "+valor3);
        }

        if(valor1<valor2 && valor1<valor3){
            System.out.println("Número menor: "+valor1);
        }else if(valor2<valor1 && valor2<valor3){
            System.out.println("Número menor: "+valor2);
        }else{
            System.out.println("Número menor: "+valor3);
        }
    }
}

