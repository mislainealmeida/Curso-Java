package edu.paraCasa.aula11a13;

import java.util.Scanner;

public class ParaCasa14 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Digite o tamanho do arquivo para download (em MB) ");
        double tamanho = scan.nextDouble();
        System.out.println("Digite a velocidade da internet (em Mbps) ");
        double velocidade = scan.nextDouble();

        double tempo= tamanho/velocidade;
        System.out.println("O tempo para download do arquivo é: "+tempo+ "minutos");

    }
}

