package edu.aula18;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número");
        int numero = scan.nextInt();
        System.out.println("Digite um limite");
        int limite = scan.nextInt();

        for(int i = numero; i <= limite; i++){
            if(i % 7 == 0) {
                continue;
            }
            System.out.println("O valor de i é: "+i);
        }
    }
}
