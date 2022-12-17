package edu.paraCasa.aula20;

import java.util.Random;

public class ParaCasa1 {
    public static void main(String[] args) {
        int[][] numerosAleatrorios= new int[4][4];

        Random numeroRandom = new Random();
        for (int i=0; i<numerosAleatrorios.length; i++){
            for(int j=0; j<numerosAleatrorios[i].length; j++){
                numerosAleatrorios[i][j]= numeroRandom.nextInt(100);
            }
        }
        int maior= Integer.MIN_VALUE;
        int linha=0;
        int coluna=0;

        for (int i=0; i<numerosAleatrorios.length; i++){
            for(int j=0; j<numerosAleatrorios[i].length; j++){
                if(numerosAleatrorios[i][j]>maior){
                    maior=numerosAleatrorios[i][j];
                    linha=i;
                    coluna=j;
                }
            }
        }

        for (int i=0; i<numerosAleatrorios.length; i++){
            for(int j=0; j<numerosAleatrorios[i].length; j++) {
                System.out.print(numerosAleatrorios[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Maior valor = "+maior);
        System.out.println("Linha = "+linha);
        System.out.println("Coluna = "+coluna);
    }
}
