package edu.paraCasa.aula14e15;

import java.util.Scanner;

public class ParaCasa3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com F ou M ");
        String sexo = scan.next();

        if (sexo.equalsIgnoreCase("f")){
            System.out.println("Feminino ");
        } else if (sexo.equalsIgnoreCase("m")) {
            System.out.println("Masculino");

        } else {
            System.out.println("Sexo inválido");
        }
    }
}
