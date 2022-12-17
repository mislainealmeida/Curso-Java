package edu.paraCasa.aula20;

import java.util.Random;

public class ParaCasa2 {
    public static void main(String[] args) {
        int[][] numerosAleatrorios = new int[10][10];

        Random numeroRandom = new Random();
        for (int i = 0; i < numerosAleatrorios.length; i++) {
            for (int j = 0; j < numerosAleatrorios[i].length; j++) {
                numerosAleatrorios[i][j] = numeroRandom.nextInt(100);
            }
        }
        for (int i = 0; i < numerosAleatrorios.length; i++) {
            for (int j = 0; j < numerosAleatrorios[i].length; j++) {
                System.out.print(numerosAleatrorios[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        int maiorL5 = Integer.MIN_VALUE;
        int menorL5 = Integer.MAX_VALUE;
        int linha5 = 5;

        for (int j = 0; j < numerosAleatrorios[linha5].length; j++) {
                if (numerosAleatrorios[linha5][j] > maiorL5) {
                    maiorL5 = numerosAleatrorios[linha5][j];
                }
                if (numerosAleatrorios[linha5][j] < menorL5) {
                    menorL5 = numerosAleatrorios[linha5][j];
                }
           }
        System.out.println("Maior valor da linha 5: " + maiorL5);
        System.out.println("Menor valor da linha 5: " + menorL5);

        System.out.println();
        int maiorC7 = Integer.MIN_VALUE;
        int menorC7 = Integer.MAX_VALUE;
        int coluna7 = 7;

        for (int i = 0; i < numerosAleatrorios.length; i++) {
            if (numerosAleatrorios[i][coluna7] > maiorC7) {
                maiorC7 = numerosAleatrorios[i][coluna7];
            }
            if (numerosAleatrorios[i][coluna7] < menorC7) {
                menorC7 = numerosAleatrorios[i][coluna7];
            }
        }
        System.out.println("Maior valor da coluna 7: " + maiorC7);
        System.out.println("Menor valor da coluna 7: " + menorC7);
    }
}