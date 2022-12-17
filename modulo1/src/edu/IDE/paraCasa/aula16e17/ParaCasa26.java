package edu.paraCasa.aula16e17;

import java.util.Scanner;

public class ParaCasa26 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Digite um número");
        int numero=scan.nextInt();
        System.out.println("Fatorial de: "+numero);
        System.out.print(numero + "! = ");


        int fatorial=1;
        for(int i=numero; i>1; i--){
            fatorial*=i;
            System.out.print(i+" . ");
        }
        System.out.print("1 = "+fatorial);
    }
}
