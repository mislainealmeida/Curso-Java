package edu.paraCasa.aula34.paraCasa3;

public class Fatorial {
    private static int num;

    public static int calcularFatorial(int num) {
        if (num == 0) {
            return 1;
        }
        int total = 1;
        for (int i = num; i > 1; i--) {
            ;
            total *= i;
        }
        return total;
    }
}
