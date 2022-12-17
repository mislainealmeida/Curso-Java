package edu.paraCasa.aula34.paraCasa2;


public class Ex02 {
    static void imprimirTela(int num){
        System.out.println(num);
    }
    public static void main(String[] args) {
        imprimirTela(Calculadora.somar(1,2));
        imprimirTela(Calculadora.subtrair(1,2));
        imprimirTela(Calculadora.multiplicar(5,5));
        imprimirTela((int)Calculadora.dividir(8,4));
        imprimirTela((int) Calculadora.potencia(7,2));


    }










}
