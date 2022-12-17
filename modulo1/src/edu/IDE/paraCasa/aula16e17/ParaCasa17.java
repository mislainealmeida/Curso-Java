package edu.paraCasa.aula16e17;

import java.util.Scanner;

public class ParaCasa17 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Digite um número");
        int numero=scan.nextInt();
        int resp;
        int fatorial=1;
        System.out.print("5! = ");

        //5!= 5*4*3*2*1=120
        for(int i=numero; i>=1; i--){
            resp= numero*i;
            resp=i;
            fatorial*=i;
            System.out.print(resp+"  ");

        }
        System.out.println(" = "+fatorial);


    }



}
