package edu.paraCasa.aula34.paraCasa2;

public class Calculadora {
    private static int num1;
    private static int num2;

    public static int somar(int num1, int num2){
        return num1 + num2;
    }
    public static int subtrair(int num1, int num2){
        return num1 - num2;
    }
    public static int multiplicar(int num1, int num2){
        return num1 * num2;
    }
    public static double dividir(int num1, int num2){
        return num1 / num2;
    }
    public static double potencia (int num1, int num2){
        return Math.pow(num1, num2);
    }



}
