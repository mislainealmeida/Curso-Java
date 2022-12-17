package edu.paraCasa.aula18e19;

import java.util.Scanner;

public class ParaCasa1 {
    public static void main(String[] args) {
        //B[i]= A[i];
        Scanner scan= new Scanner(System.in);
        int [] A=new int[5];
        int [] B=new int[5];

        for(int i=0; i<A.length; i++ ){
            System.out.println("Entre com o valor da posição "+i);
            A[i]=scan.nextInt();
            B[i]= A[i];
        }
         System.out.print("A = ");
        for(int i=0; i<A.length; i++ ){
            System.out.print(A[i]+" ");
        }
        System.out.println(" ");
        System.out.print("B = ");
        for(int i=0; i<B.length; i++ ){
            System.out.print(B[i]+" ");
        }

    }

}
