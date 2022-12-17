package edu.paraCasa.aula11a13;

import java.util.Scanner;

public class ParaCasa6 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Qual o raio do círculo? ");
        double raio = scan.nextDouble();

        double area= 3.14 * raio*raio;
        System.out.println("A área do círculo é : "+area);
    }
}
