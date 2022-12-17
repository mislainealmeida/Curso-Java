package edu.paraCasa.aula16e17;

import java.util.Scanner;

public class ParaCasa20 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Digite a quantidade de pessoas ");
        int qtdPessoas= scan.nextInt();

        int idade;
        int soma=0;
        int media;

        for(int i=1; i<=qtdPessoas; i++) {
            System.out.println("Digite a idade "+i);
            idade = scan.nextInt();
            soma += idade;
        }
        media=soma/qtdPessoas;
        System.out.println("A soma das idades é: "+soma);
        System.out.println("A média de idade é: "+media);

        if(media>0 && media<=26){
            System.out.println("Jovens");
        } else if ((media >26 && media<=60)) {
            System.out.println("Adultos");
        }else{
            System.out.println("Idosos");
        }


    }
}
