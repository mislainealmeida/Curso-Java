package edu.paraCasa.aula18e19;

import java.util.Scanner;

public class ParaCasa20 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        double[] a= new double[20];
        double cotacao;

        System.out.println("Qual a cotação do dólar: ");
        cotacao= scan.nextDouble();

        for (int i=0; i<a.length; i++){
            a[i]= cotacao*(i+1);
        }
        System.out.println("A= ");
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]+" ");
        }
        System.out.println();
    }
}
