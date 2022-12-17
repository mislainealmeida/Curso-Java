package edu.aula45;

public class Teste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        //upcasting - é feito automático, mas pode fazer manual.
        Pessoa alunoPessoa = new Aluno();
        Pessoa aluno2= (Pessoa) new Aluno();

        //Downcasting
        Pessoa aluno3= new Pessoa();
        Pessoa aluno4= (Aluno)aluno3;

    }
}
