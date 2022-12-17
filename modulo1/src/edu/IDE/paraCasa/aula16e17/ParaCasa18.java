package edu.paraCasa.aula16e17;

import java.util.Scanner;

public class ParaCasa18 {
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
        System.out.println("Digite um número ");
        int numero = scan.nextInt();
        boolean primo=true;


        for(int i=2; i<numero; i++) {
            if (numero % i == 0) {
                System.out.println("Não é primo");
                primo = false;

            }
        }
            if(primo){
                System.out.println("É primo.");

            }

    }
}
