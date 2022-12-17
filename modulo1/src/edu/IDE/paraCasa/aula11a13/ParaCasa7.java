package edu.paraCasa.aula11a13;

import java.util.Scanner;

public class ParaCasa7 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Qual a largura do quadrado? ");
        double largura = scan.nextDouble();

        double area = largura * largura;
        double dobro= area*2;
        System.out.println(dobro);
    }
}
