package edu.paraCasa.aula11a13;

import java.util.Scanner;

public class ParaCasa10 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Celsius: ");
        double celsius = scan.nextDouble();

        double farenheit= celsius+32;
        System.out.println(celsius +"ºC é igual "+ farenheit +"F");
    }
}
