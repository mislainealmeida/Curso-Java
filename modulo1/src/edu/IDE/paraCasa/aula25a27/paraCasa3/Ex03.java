package edu.paraCasa.aula25a27.paraCasa3;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Scanner scan = new Scanner(System.in);

        System.out.println("Nome do aluno: ");
        aluno.nome= scan.next();
        System.out.println("Curso: ");
        aluno.curso=scan.next();
        System.out.println("Matrícula do aluno "+aluno.nome);
        aluno.matricula=scan.next();


        aluno.disciplinas = new String[3];
        for (int i = 0; i <aluno.disciplinas.length; i++) {
                System.out.println("Informe a disciplina "+(i+1));
                aluno.disciplinas[i] = scan.next();
        }

        aluno.notas = new double[aluno.disciplinas.length][4];
        for (int i = 0; i < aluno.disciplinas.length; i++) {
            for (int j = 0; j < aluno.notas[i].length; j++) {
                System.out.println("Informe a nota " + (j + 1) + " da disciplina " + aluno.disciplinas[i]);
                aluno.notas[i][j] = scan.nextDouble();
            }

        }
        aluno.mostrarInformacoes();
        for(int i=0; i<aluno.disciplinas.length; i++){
            if(aluno.verificarAprovado(i)){
                System.out.println("Disciplina "+aluno.disciplinas[i]+" foi APROVADO");
                System.out.println("Média: "+aluno.media);
            }else{
                System.out.println("Disciplina "+aluno.disciplinas[i]+" foi REPROVADO");
                System.out.println("Média: "+aluno.media);
            }
        }
    }
}
