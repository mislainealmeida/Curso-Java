package edu.paraCasa.aula16e17;

import java.util.Scanner;

public class ParaCasa4 {
    public static void main(String[] args) {
        int populacaoA= 80000;
        int populacaoB=200000;
        int i=0;

        while(populacaoA<=populacaoB){
            populacaoA +=(populacaoA*3)/100;
            populacaoB +=(populacaoB*1.5)/100;
            i++;
        }
        System.out.println("Irá levar "+i+" anos para a população A ultrapassar a população B.");
    }


}


