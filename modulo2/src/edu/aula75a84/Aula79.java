package edu.aula75a84;

public class Aula79 {
    public static void main(String[] args) {

        String banana = "banana";
        String ana = "ana";
        //procura em qual índice está o caractere na string.
        System.out.println(banana.indexOf('x'));//-1 caso não tenha encontrado
        System.out.println(banana.indexOf('b'));//fala o primeiro índice que é encontrado o caractere
        System.out.println(banana.indexOf('a'));
        System.out.println(banana.indexOf(ana));

        //a último índice que aparece aquele caractere na string.
        System.out.println(banana.lastIndexOf('a'));
        System.out.println(banana.lastIndexOf(ana));

        //se contém aquele caractere na string
        System.out.println(banana.contains(ana));
        System.out.println(banana.contains("ceu"));
    }
}
