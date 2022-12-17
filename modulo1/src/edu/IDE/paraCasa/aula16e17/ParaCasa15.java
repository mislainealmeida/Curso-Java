package edu.paraCasa.aula16e17;

import java.util.Scanner;

public class ParaCasa15 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Entre com o n-ésimo termo da série de fibonacci: ");
       int n=scan.nextInt();
       int num1=1;
       int num2=1;
       int resp;
        System.out.print(num1+" ");
        System.out.print(num2+" ");

       for(int i=3; i<=n; i++){
          resp = num1+num2;
          num1=num2;
          num2=resp;
          System.out.print(resp+" ");
       }

    }
}
