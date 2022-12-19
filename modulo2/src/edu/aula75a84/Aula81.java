package edu.aula75a84;

public class Aula81 {
    public static void main(String[] args) {

        String teste = "Teste";

        String testeMinusc = teste.toLowerCase();//minúsculo
        String testeMaisc = teste.toUpperCase();//maiúsculo

        System.out.println(testeMinusc);
        System.out.println(testeMaisc);

        //uma outra forma de fazer o egualIgnoreCase:
        //if (teste.toLowerCase().equals(teste.toLowerCase()))
    }
}
