package edu.paraCasa.aula18e19;

import java.util.Scanner;

public class ParaCasa14 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        int[] a = new int[10];
        int soma=0;
        double impar=0;
        double media;



        for(int i=0; i<a.length; i++){
            System.out.println("digite um valor para a posição "+i);
            a[i]= scan.nextInt();

        }
        System.out.print("A = ");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }

        System.out.println(" ");
        System.out.print("Ímpares: ");
        for(int i=0; i<a.length; i++){
            if(a[i] % 2 != 0){
                System.out.print(+a[i]+" ");
                soma+=a[i];
                impar++;
            }
        }

        media= soma/impar;
        System.out.println();
        System.out.println("Total de ímpares: "+impar);
        System.out.println("Soma: "+soma);
        System.out.println("Média: "+media);
    }
}
