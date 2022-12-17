package edu.paraCasa.aula11a13;

import java.util.Scanner;

public class ParaCasa9 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Farenheit: ");
        double farenheit = scan.nextDouble();

        double celsius= farenheit - 32;
        System.out.println(farenheit +"º F é igual "+ celsius +"º Celsius");
    }
}
