package edu.paraCasa.aula11a13;

import java.util.Scanner;

public class ParaCasa5 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Quantos metros? ");
        double metros = scan.nextDouble();

        double centimetros= metros*100;
        System.out.println(metros +" metro(s) é igual "+ centimetros + " centímetro(s).");
    }
}
