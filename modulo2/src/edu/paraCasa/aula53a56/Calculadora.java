package edu.paraCasa.aula53a56;

public class Calculadora {

    public static void main(String[] args) {
        double x = 2.0;
        double y = 3.0;

        for (Operacao op : Operacao.values()) {
            System.out.print(x + " ");//2
            System.out.print(op.toString() + " ");//+
            System.out.print(y + " "+ "= ");//3=
            System.out.println(op.executarOperacao(x, y));//5
        }
    }
}
