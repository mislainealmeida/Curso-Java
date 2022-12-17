package edu.paraCasa.aula14e15;

import java.util.Scanner;

public class ParaCasa18 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        int numero= scan.nextInt();

        if(numero%2==0){
            System.out.println(numero+ " É PAR");
        }else{
            System.out.println(numero+" É ÍMPAR");
        }
    }
}
