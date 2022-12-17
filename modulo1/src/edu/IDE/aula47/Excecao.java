package edu.aula47;

public class Excecao {
    public static void main(String[] args) {

        // sem o tratamento a execução foi interrompido no momento do erro.

        /*int[] vetor= new int[4];
        System.out.println("Antes da exception");
        vetor[4]=1;
        System.out.println("Esse texto não será impresso");*/

        try{
            int[] vetor= new int[4];
            System.out.println("Antes da exception");
            vetor[4]=1;
        }catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("Execeção ao acessar um índice do vetor que não existe. ");
        }

        System.out.println("Esse texto será impresso");


    }
}
