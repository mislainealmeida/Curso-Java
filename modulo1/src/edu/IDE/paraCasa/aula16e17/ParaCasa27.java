package edu.paraCasa.aula16e17;

import java.util.Scanner;

public class ParaCasa27 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Entre com a quantidade de temperaturas");
        int qtdTemperatura= scan.nextInt();
        double temperatura;
        double soma=0;
        double menor=Double.MAX_VALUE;
        double maior=Double.MIN_VALUE;

        for(int i=1; i<=qtdTemperatura; i++){
            System.out.println("Entre com a temperatura "+1);
            temperatura=scan.nextDouble();

            soma+=temperatura;
            if(temperatura>maior){
                maior=temperatura;
            }
            if(temperatura<menor){
                menor=temperatura;
            }
        }
        System.out.println("Média: "+(soma/qtdTemperatura));
        System.out.println("Menor temperatura: "+menor);
        System.out.println("Maior temperatura: "+maior);

    }
}
