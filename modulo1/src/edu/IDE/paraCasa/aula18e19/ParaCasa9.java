package edu.paraCasa.aula18e19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ParaCasa9 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[a.length];
        double[] c =new double[a.length];

        for(int i=0; i<a.length; i++){
            System.out.println("Digite o primeiro valor na posição "+i);
            a[i]= scan.nextInt();

            System.out.println("Digite o segundo valor na posição "+i);
            b[i]= scan.nextInt();

            c[i]= a[i]/b[i];
            //no caso da divisão um inteiro por um inteiro pode ser decima, por isso no c utilizamos um double
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
        DecimalFormat df= new DecimalFormat("###,###.###");
        System.out.print("C = ");
        for(int i=0; i<c.length; i++){
            System.out.print(c[i]+" ");
        }
    }
}
