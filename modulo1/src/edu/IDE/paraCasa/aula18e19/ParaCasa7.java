package edu.paraCasa.aula18e19;

import java.util.Scanner;

public class ParaCasa7 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[a.length];
        int[] c =new int[a.length];

        for(int i=0; i<a.length; i++){
            System.out.println("Digite o primeiro valor na posição "+i);
            a[i]= scan.nextInt();

            System.out.println("Digite o segundo valor na posição "+i);
            b[i]= scan.nextInt();

            c[i]= a[i]-b[i];
        }
        System.out.print("A = ");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }

        System.out.println();
        System.out.print("B = ");
        for(int i=0; i<b.length; i++){
            System.out.print(b[i]+" ");
        }

        System.out.println();
        System.out.print("C = ");
        for(int i=0; i<c.length; i++){
            System.out.print(c[i]+" ");
        }
    }
}
