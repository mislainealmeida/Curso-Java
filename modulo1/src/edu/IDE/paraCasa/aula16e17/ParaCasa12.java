package edu.paraCasa.aula16e17;

import java.util.Scanner;

public class ParaCasa12 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Escolha a tabuada (1-10)");
        int num= scan.nextInt();
        System.out.println("Tabuada de "+num+": ");

        for(int i=1; i<=10; i++){
            int tab= num*i;
            System.out.println(num +" x "+i+" = "+tab);

        }
    }


}
