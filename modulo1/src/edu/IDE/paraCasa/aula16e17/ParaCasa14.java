package edu.paraCasa.aula16e17;

import java.util.Scanner;

public class ParaCasa14 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int numero;
        int somaPar=0;
        int somaImpar=0;

        for (int i=1; i<=10; i++){
            System.out.println("Digite um número inteiro");
            numero=scan.nextInt();

            if(numero%2==0){
                somaPar++;
            }else{
                somaImpar++;
            }


        }
        System.out.println("Pares :"+somaPar);
        System.out.println("Ímpares: "+somaImpar);
    }
}
