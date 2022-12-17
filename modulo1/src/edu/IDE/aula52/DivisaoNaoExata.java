package edu.aula52;

public class DivisaoNaoExata extends Exception {
    private int num;
    private int deno;

    public DivisaoNaoExata(int num, int deno){
        super();
        this.num= num;
        this.deno= deno;
    }

    @Override
    public String toString() {
        return "Resultado de "+num+" dividido por "+deno+" não é um inteiro";
    }
}
