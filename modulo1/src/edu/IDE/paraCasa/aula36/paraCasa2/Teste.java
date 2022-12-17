package edu.paraCasa.aula36.paraCasa2;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o nome do curso");
        String nomeCurso= scan.nextLine();
        System.out.println("Entre com o horário do curso");
        String horario= scan.nextLine();
        System.out.println("Entre com o nome do professor do curso");
        String nomeProfessor= scan.nextLine();
        System.out.println("Entre com o e-mail do professor");
        String email= scan.nextLine();
        System.out.println("Entre com o departamento do professor");
        String departamento= scan.nextLine();

        Curso curso= new Curso();
        curso.setNomeCurso(nomeCurso);
        curso.setHorario(horario);

        Professor prof = new Professor();
        prof.setNomeProfessor(nomeProfessor);
        prof.setDepartamento(departamento);
        prof.setEmail(email);

        curso.setProfessor(prof);

        Aluno[] alunos = new Aluno[5];
        for(int i=0; i<5; i++){
            scan.nextLine();
            System.out.println("Entre com o nome do aluno. ");
            String nomeAluno=scan.nextLine();
            System.out.println("Entre com a matrícula do aluno. ");
            String matricula=scan.nextLine();

            double[] notas = new double[4];
            for(int j=0; j<4; j++){
                System.out.println("Entre com a nota "+(j+1));
                notas[j]= scan.nextDouble();
            }
            Aluno aluno = new Aluno();
            aluno.setNomeAluno(nomeAluno);
            aluno.setMatricula(matricula);
            aluno.setNotas(notas);
            alunos[i]=aluno;
        }

        curso.setAlunos(alunos);
        System.out.println(curso.obterInfo());





    }
}
