package edu.paraCasa.aula34.paraCasa1;

public class Contador {
    private static int contador;//valor inicial de uma variável inteira é zero, quando não se coloca nada.

    public static void incrementar(){
        contador++;
    }
    public static void zerar(){
        contador=0;
    }

    public static int obterValor(){
        return contador;
    }


}
