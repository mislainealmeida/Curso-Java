package edu.paraCasa.aula14e15;

import java.util.Scanner;

public class ParaCasa2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um valor positivo ou negativo ");
        int valor = scan.nextInt();

        if(valor<0){
            System.out.println("Negativo");
        }else{
            System.out.println("Positivo");
        }
    }
}
