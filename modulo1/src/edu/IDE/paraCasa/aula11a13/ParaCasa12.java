package edu.paraCasa.aula11a13;

import java.util.Scanner;

public class ParaCasa12 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Qual a altura em metros? ");
        double altura = scan.nextDouble();

        double pesoIdeal= (72.7 * altura) - 58;
        System.out.println("O peso ideal para a altura "+altura+" metros é de "+pesoIdeal+ " Kg.");

    }
}
