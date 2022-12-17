package edu.paraCasa.aula18e19;

import java.util.Scanner;

public class ParaCasa19 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int alunos[] = new int[10];
        double nota1[]= new double[alunos.length];
        double nota2[]=new double[alunos.length];
        double media[]= new double[alunos.length];

        for (int i=0; i<alunos.length; i++){
            System.out.println("Qual a primeira nota do aluno "+(i+1));
            nota1[i]= scan.nextDouble();
            System.out.println("Qual a segunda nota do aluno "+(i+1));
            nota2[i]= scan.nextDouble();
            media[i]= (nota1[i]+nota2[i])/2;
        }

        for (int i=0; i<alunos.length; i++){
            System.out.print("A média do aluno "+(i+1)+ " é: "+media[i]);
            if(media[i]>=7){
                System.out.println(" - APROVADO");
            }else if(media[i]<7 && media[i]>=4) {
                System.out.println(" - RECUPERAÇÃO");
            }else{
                System.out.println(" - REPROVADO");
            }
        }

    }
}

