package edu.paraCasa.aula14e15;

import java.util.Scanner;

public class ParaCasa8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o valor da TV1: ");
        double valor1 = scan.nextDouble();

        System.out.println("Entre com o valor da TV2: ");
        double valor2 = scan.nextDouble();

        System.out.println("Entre com o valor da TV3: ");
        double valor3 = scan.nextDouble();

        if(valor1<=valor2 && valor1<=valor3){
        System.out.println("Compre a TV1");
        }else if(valor2<=valor1 && valor2<=valor3){
        System.out.println("Compre a TV2");
        }else{
        System.out.println("Compre a TV3");
        }
    }
}

