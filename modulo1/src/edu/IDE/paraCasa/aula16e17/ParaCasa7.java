package edu.paraCasa.aula16e17;

import java.util.Scanner;

public class ParaCasa7 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int numero;
        int maior=Integer.MIN_VALUE;// o menor número possível.

        for(int i=0; i<5; i++){
            System.out.println("digite um número");
            numero=scan.nextInt();

            if(numero>maior){//se o num for maior que a variavel maior, a variavel recebe o num.
                maior=numero;
            }

        }
        System.out.println("O maior número digitado foi: "+maior);
    }



}
