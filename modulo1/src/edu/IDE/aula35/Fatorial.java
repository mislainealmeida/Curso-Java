package edu.aula35;

public class Fatorial {
    //fatorial x fatorial do número
    //fatorial(5)= 5*fatorial(4)
    //fatorial(4)= 4*fatorial(3)
    //fatorial(3)= 3*fatorial(2)
    //fatorial(2)= 2*fatorial(1)
    //fatorial(1)= 1*fatorial(0)
    //fatorial(0)= 1 --> ponto de parada

    public static int fatorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * fatorial(num - 1);
    }
}
