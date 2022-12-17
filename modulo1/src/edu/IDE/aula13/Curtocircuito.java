package edu.aula13;

public class Curtocircuito {
    public static void main(String[] args) {
        boolean verdadeiro= true;
        boolean falso = false;
        boolean resultado1 = falso & verdadeiro;
        boolean resultado2 = falso && verdadeiro; // se o primeiro for falso nem verifica o segundo

        System.out.println(resultado1);
        System.out.println(resultado2);

        int resultado= 1+1-1+1*1/1;
        System.out.println(resultado);
    }
}
