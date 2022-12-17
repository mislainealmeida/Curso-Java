package edu.aula35;

import java.util.Scanner;

public class TesteFatorial {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Digite um número positivo");
        int num = scan.nextInt();
        System.out.println(Fatorial.fatorial(num));

    }
}
