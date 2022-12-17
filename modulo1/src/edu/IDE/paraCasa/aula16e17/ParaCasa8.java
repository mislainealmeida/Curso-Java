package edu.paraCasa.aula16e17;

import java.util.Scanner;

public class ParaCasa8 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int numero;
        int soma=0;
        double media;


        for(int i=0; i<5; i++){
            System.out.println("digite um número");
            numero=scan.nextInt();
            soma +=numero;
        }
        media= soma/5;
        System.out.println("A soma é: "+soma);
        System.out.println("A média é: "+media);

    }
}
