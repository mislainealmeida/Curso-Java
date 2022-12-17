package edu.paraCasa.aula24.paraCasa4;

import java.util.Date;

public class Ex04 {
    public static void main(String[] args) {
        LivroBiblioteca livro = new LivroBiblioteca();

        livro.nome="Programação";
        livro.autor="Maria";
        livro.anoLancamento= 2020;
        livro.emprestado=true;
        livro.dataEntrega= new Date();
        livro.emprestado1="Ana";

        System.out.println(livro.nome);
        System.out.println(livro.autor);
        System.out.println(livro.anoLancamento);
        System.out.println(livro.emprestado);
    }

}
