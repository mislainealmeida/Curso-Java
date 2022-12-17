package edu.aula37;

public class Teste {

    public static void main(String[] args) {
        /*Aluno aluno=new Aluno();
        //acesso a todos os atributos de aluno.
        Professor professor = new Professor();
        Pessoa pessoa= new Pessoa();

        aluno.setNome("Maria");*/
        //professor.setTelefoneCelular(telefoneCelular);

        Pessoa aluno = new Aluno();//declamos a classe Pessoa, mas instanciamos a classe aluno.
        //acesso apenas os atributos em comum.
        //A classe Pessoa é a classe mãe/pai da classe Aluno, ou seja, Pessoa é uma superclasse.
        Pessoa professor= new Professor();





    }



}
