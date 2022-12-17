package edu.paraCasa.aula16e17;

import java.util.Scanner;

public class ParaCasa13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número da base ");
        int base = scan.nextInt();
        System.out.println("Digite o número do expoente ");
        int exp = scan.nextInt();
        int res=1;

        for (int i = 0; i <exp; i++) {
            res*=base;
        }

        System.out.println(res);

    }
}
