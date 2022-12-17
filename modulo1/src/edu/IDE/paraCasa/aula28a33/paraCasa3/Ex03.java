package edu.paraCasa.aula28a33.paraCasa3;


import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Scanner scan = new Scanner(System.in);

        System.out.println("Nome do aluno: ");
        aluno.setNome(scan.next());
        System.out.println("Curso: ");
        aluno.setCurso(scan.next());
        System.out.println("Matrícula do aluno: ");
        aluno.setMatricula(scan.next());


        for (int i = 0; i <aluno.getDisciplinas().length; i++) {
            System.out.println("Informe a disciplina "+(i+1));
            aluno.setDisciplinasPos(i, scan.next());
        }

        for (int i = 0; i < aluno.getNotas().length; i++) {
            for (int j = 0; j < aluno.getNotas()[i].length; j++) {
                System.out.println("Informe a nota " + (j + 1) + " da disciplina " + aluno.getDisciplinas()[i]);
                aluno.setNotasPosIJ(i,j,scan.nextDouble());
            }

        }
        aluno.mostrarInformacoes();
        for(int i=0; i<aluno.getDisciplinas().length; i++){
            if(aluno.verificarAprovado(i)){
                System.out.println("Disciplina "+aluno.getDisciplinas()[i]+" foi APROVADO");
                System.out.println("Média: "+aluno.getMedia());
            }else{
                System.out.println("Disciplina "+aluno.getDisciplinas()[i]+" foi REPROVADO");
                System.out.println("Média: "+aluno.getMedia());
            }
        }
    }
}
