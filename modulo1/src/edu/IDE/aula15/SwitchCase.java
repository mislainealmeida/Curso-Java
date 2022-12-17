package edu.aula15;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um dia da semana (1-7): ");
        int diaSemana = scan.nextInt();



        /*switch(diaSemana){
            case 1:
                System.out.println("Domingo");
                break;//sem o break eke irá executar todos os comandos até achar um break
            case 2:
                System.out.println("Segunda");
                break;// caso o usuário digitar 2, vai ser executado do 2 até o 7 ou até achar um break
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Não é um dia da semana válido");

        }*/
        switch (diaSemana) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            case 1:
            case 7:
                System.out.println("Fim de semana");
                break;
            default:
                System.out.println("Não é um dia da semana válido");
                break;
        }
    }
}

