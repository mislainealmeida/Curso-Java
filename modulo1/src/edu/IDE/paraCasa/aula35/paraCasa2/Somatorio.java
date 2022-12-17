package edu.paraCasa.aula35.paraCasa2;

public class Somatorio {

    public static int somatorio(int num){

        if (num == 1) {
            return 1;
        }
        return num + somatorio(num - 1);
    }

}
