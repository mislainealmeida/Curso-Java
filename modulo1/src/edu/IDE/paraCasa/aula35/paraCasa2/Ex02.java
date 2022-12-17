package edu.paraCasa.aula35.paraCasa2;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Digite um número positivo");
        int num = scan.nextInt();
        System.out.println(Somatorio.somatorio(num));

    }

}

