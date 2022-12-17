package edu.paraCasa.aula18e19;

import java.util.Scanner;

public class ParaCasa16 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int[] a= new int[10];
        int soma=0;
        int soma2=0;
        int soma3=0;
        int soma4=0;



        for(int i=0; i<a.length; i++) {
            System.out.println("Digite um valor para a posição " + i);
            a[i] = scan.nextInt();
        }

        System.out.print("A= ");
        for(int i=0; i<a.length; i++) {
            System.out.print(a[i]+" ");
            if(a[i]<15){
                soma+=a[i];
            }else if(a[i]==15){
                soma2++;
            }else{
                soma3+=a[i];
                soma4++;
            }
        }


        System.out.println(" ");
        System.out.println("Soma dos elementos menores que 15: "+soma);
        System.out.println("Quantidade de elementos iguais a 15: "+soma2);
        System.out.println("Soma dos elementos maiores que 15: "+soma3);
        System.out.println("A quantidade de elementos maiores que 15: "+soma4);
        System.out.println("A média dos elementos maiores que 15: "+(soma3/soma4));


    }
}
