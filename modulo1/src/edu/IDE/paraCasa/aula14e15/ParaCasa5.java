package edu.paraCasa.aula14e15;

import java.util.Scanner;

public class ParaCasa5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com a primeira nota: ");
        double nota1 = scan.nextDouble();

        System.out.println("Entre com a segunda nota: ");
        double nota2 = scan.nextDouble();

        double media = (nota1+nota2)/2;
        System.out.println("Média: "+media);
        if(media==10){
            System.out.println("APROVADO COM DISTINÇÃO");
        }else if(media>=7){
            System.out.println("APROVADO");
        }else{
            System.out.println("REPROVADO");
        }
    }
}
