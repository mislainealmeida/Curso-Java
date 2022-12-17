package edu.paraCasa.aula18e19;

import java.lang.Math;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ParaCasa4 {
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
        int[] A= new int[15];
        double[] B= new double[A.length];

        for(int i=0; i<A.length; i++){
            System.out.println("Digite um valor para a posição "+i);
            A[i]=scan.nextInt();
            B[i]=Math.sqrt(A[i]);
        }
        System.out.print("A = ");
        for(int i=0; i<A.length; i++){
            System.out.print(A[i]+" ");
        }

        System.out.println(" ");
        DecimalFormat df= new DecimalFormat("###,###.###");

        System.out.print("B = ");
        for(int i=0; i<B.length; i++){
            System.out.print(df.format(B[i])+" ");
        }
    }
}
