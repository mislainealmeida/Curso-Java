package edu.aula66;

import edu.aula61.Contato;

public class ColetorLixo {
    public static void obterMemoriaUsada(){

        final int MB = 1024 * 1024;

        Runtime runtime = Runtime.getRuntime(); //singleton


        System.out.println((runtime.totalMemory() - runtime.freeMemory())/MB);

    }

    public static void main(String[] args) {

        Contato[] contatos = new Contato[100000000];//além de alogar 10 mil espaços de memória além da referência na heap.
        Contato contato;

        for (int i=0; i<contatos.length; i++){
            contato = new Contato("Contato"+i, "1234-56789"+i, "contato"+i+"@email.com");
            contatos[i] = contato;
        }

        System.out.println("Contatos criados");

        obterMemoriaUsada();

        contatos = null;

        Runtime.getRuntime().runFinalization();//forçando a execução do garbage collector

        Runtime.getRuntime().gc();

        System.out.println("Contatos removidos da memória");

        obterMemoriaUsada();
    }
}
