package edu.paraCasa.aula16e17;

import java.util.Scanner;

public class ParaCasa21 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Digite a quantidade de turmas");
        int turmas=scan.nextInt();

        int alunos;
        boolean valido=true;
        int soma=0;
        int media=0;

        for(int i=0; i<turmas; i++){
            System.out.println("Quantos alunos tem na turma "+(i+1)+": ");
            alunos= scan.nextInt();
            if(alunos>1 && alunos<=40) {
                valido = true;
                soma += alunos;
            }else{
                valido=false;
                System.out.println("A turma não pode ter mais de 40 alunos. ");

            }

        }
        media= soma/turmas;
        System.out.println("A soma de alunos é: "+soma);
        System.out.println("A média de alunos é por turma é: "+media);
    }
}
