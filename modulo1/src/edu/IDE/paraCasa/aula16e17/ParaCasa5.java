package edu.paraCasa.aula16e17;

import java.util.Scanner;

public class ParaCasa5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double populacaoA;
        double populacaoB;
        double crescimentoA;
        double crescimentoB;

        boolean valido=false;
        do {
            System.out.println("Qual a população A?");
            populacaoA = scan.nextDouble();
            if (populacaoA > 0) {
                valido = true;
            } else {
                System.out.println("População precisa ser maior que 0");
            }
        }while(!valido);

        valido=false;
        do {
            System.out.println("Qual a população B?");
            populacaoB = scan.nextDouble();
            if (populacaoB > 0) {
                valido = true;
            } else {
                System.out.println("População precisa ser maior que 0");
            }
        }while(!valido);

        valido=false;
        do {
            System.out.println("Qual a porcentagem de crescimento da população A?");
            crescimentoA = scan.nextDouble();
            if (crescimentoA > 0) {
                valido = true;
            } else {
                System.out.println("Crescimento precisa ser maior que 0");
            }
        }while (!valido) ;

        valido=false;
        do {
            System.out.println("Qual a porcentagem de crescimento da população B?");
            crescimentoB=scan.nextDouble();
            if (crescimentoB > 0) {
                valido = true;
            } else {
                System.out.println("Crescimento precisa ser maior que 0");
            }
        }while(!valido);

        int i = 0;

        while(populacaoA<=populacaoB){
            populacaoA +=(populacaoA*crescimentoA)/100;
            populacaoB +=(populacaoB*crescimentoB)/100;
            i++;
        }
        System.out.println("Irá levar "+i+" anos para a população A ultrapassar a população B.");


    }

}
