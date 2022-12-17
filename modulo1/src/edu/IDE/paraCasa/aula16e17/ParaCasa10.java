package edu.paraCasa.aula16e17;

import java.util.Scanner;

public class ParaCasa10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro");
        int num1=scan.nextInt();
        System.out.println("Digite o segundo número inteiro");
        int num2=scan.nextInt();

        for(int i=num1; i<=num2; i++){
            System.out.print(i+" ");

        }
    }
}
