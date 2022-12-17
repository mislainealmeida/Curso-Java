package edu.paraCasa.aula11a13;

import java.util.Scanner;

public class ParaCasa3 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double numero1 = scan.nextDouble();
        System.out.println("Digite o segundo número: ");
        double numero2=scan.nextDouble();
        double soma= numero1+numero2;
        System.out.println("A soma dos números é: "+soma);

    }
}
