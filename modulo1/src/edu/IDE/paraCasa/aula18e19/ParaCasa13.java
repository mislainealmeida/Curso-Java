package edu.paraCasa.aula18e19;

import java.util.Scanner;

public class ParaCasa13 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int[] a = new int[10];
        int soma=0;



        for(int i=0; i<a.length; i++){
            System.out.println("digite um valor para a posição "+i);
            a[i]= scan.nextInt();

            if(a[i] % 5 == 0){
                soma+=1;
            }
        }

        System.out.print("A = ");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Há "+soma+ " valor(s) múltiplo de 5.");

    }
}
