package edu.aula18;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número");
        int numero = scan.nextInt();
        System.out.println("Digite um limite");
        int limite = scan.nextInt();

        for(int i = numero; i <= limite; i++){
            System.out.println(i);
            if(i % 7 == 0){
                System.out.println("O valor de i é: "+i);
                break;
            }
        }
    }
}
