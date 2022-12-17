package edu.paraCasa.aula24.paraCasa3;

import edu.paraCasa.aula24.paraCasa2.Livro;

public class Ex03 {
    public static void main(String[] args) {
        LivroLivraria livro= new LivroLivraria();

        livro.nome="Programação";
        livro.autor="Maria";
        livro.anoLancamento= 2020;

        System.out.println(livro.nome);
        System.out.println(livro.autor);
        System.out.println(livro.anoLancamento);
    }

}
