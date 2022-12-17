package edu.paraCasa.aula34.paraCasa1;

public class Ex01 {
    static void imprimirValor(){
        System.out.println(Contador.obterValor());
    }
    public static void main(String[] args) {

        imprimirValor();
        Contador.incrementar();
        imprimirValor();
        Contador.zerar();
        imprimirValor();
        Contador.incrementar();
        Contador.incrementar();
        Contador.incrementar();
        imprimirValor();

        //a variável estática mesmo instanciada continua com o mesmo valor.
        Contador cont = new Contador();
        Contador cont1 = new Contador();
        Contador cont2 = new Contador();

        imprimirValor();



    }
}
