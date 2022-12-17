package edu.paraCasa.aula14e15;

import java.util.Scanner;

public class ParaCasa1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o primeiro valor ");
        int valor1 = scan.nextInt();
        System.out.println("Entre com o segundo valor ");
        int valor2 = scan.nextInt();

        if (valor1>valor2){
            System.out.println(valor1);
        }else{
            System.out.println(valor2);
        }
    }
}
