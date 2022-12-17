package edu.paraCasa.aula16e17;

import java.util.Scanner;

public class ParaCasa16 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Entre com o n-ésimo termo da série de fibonacci: ");
        int n=scan.nextInt();
        int num1=1;
        int num2=1;
        int resp=1;
        System.out.print(num1+" ");

        while(resp<=500){
            System.out.print(resp+" ");
            resp = num1+num2;
            num1=num2;
            num2=resp;

        }

    }
}
