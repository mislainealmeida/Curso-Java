package edu.paraCasa.aula34.paraCasa3;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int num;

        do{
            System.out.println("Entre com um número positivo");
            num=scan.nextInt();
        }while(num<0);
        System.out.println(Fatorial.calcularFatorial(num));

    }
}
