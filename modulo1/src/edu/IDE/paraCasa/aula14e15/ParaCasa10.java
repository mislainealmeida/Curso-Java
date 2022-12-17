package edu.paraCasa.aula14e15;

import java.util.Scanner;

public class ParaCasa10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o turno em que você estuda. M-matutino, V-vespertino, N-noturno ");
        String turno = scan.next();

        switch(turno){
            case "m":
            case "M":
                System.out.println("Bom dia!");
                break;
            case "v":
            case "V":
                System.out.println("Boa tarde!");
                break;
            case "n":
            case "N":
                System.out.println("Boa noite!");
                break;
            default:
                System.out.println("Valor inválido");
        }

    }
}
