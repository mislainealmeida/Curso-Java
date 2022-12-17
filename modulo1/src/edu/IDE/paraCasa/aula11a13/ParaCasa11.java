package edu.paraCasa.aula11a13;

import java.util.Scanner;

public class ParaCasa11 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        int primeiro = scan.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        int segundo = scan.nextInt();
        System.out.println("Digite um número real: ");
        double terceiro = scan.nextDouble();

        //dobro do primeiro com a metade do segundo
        int resultado1= (primeiro*2) * (segundo/2);
        System.out.println(resultado1);

        //triplo do primeiro com o terceiro
        double resultado2= (primeiro *3) + terceiro;
        System.out.println(resultado2);

        //terceiro elevado ao cubo
        double resultado3= Math.pow(terceiro,3);
        System.out.println(resultado3);
    }
}
