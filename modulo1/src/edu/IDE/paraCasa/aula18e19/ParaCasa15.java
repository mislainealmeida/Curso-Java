package edu.paraCasa.aula18e19;

import java.util.Scanner;

public class ParaCasa15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[10];
        int somaPar=0;
        int somaImpar=0;


        for(int i=0; i<a.length; i++){
            System.out.println("Digite um número para a posição :"+i);
            a[i]= scan.nextInt();

            if(a[i] % 2 ==0){
               somaPar++;
            }else{
                somaImpar++;
            }
        }
        double porcentagemPar = (somaPar*100)/a.length;
        double porcentagemImpar = (somaImpar*100)/a.length;
        System.out.println("Quantidade de Pares: "+somaPar);
        System.out.println("Porcentagem dos pares: "+porcentagemPar+"%");
        System.out.println("Quantidade dos Ímpares: "+somaImpar);
        System.out.println("Porcentagem dos Ímpares: "+porcentagemImpar+"%");
    }
}
