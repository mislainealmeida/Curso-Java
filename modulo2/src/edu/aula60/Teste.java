package edu.aula60;

public class Teste {
    public static void main(String[] args) {
        EscopoVariaveis escopo = new EscopoVariaveis();
        escopo.setValor(10);

        System.out.println(escopo.getValor());//10
        System.out.println(escopo.calcularValor(20));//30
        System.out.println(escopo.getValor());//10
        System.out.println(escopo.teste());//4
        System.out.println(escopo.getValor());


    }
}
