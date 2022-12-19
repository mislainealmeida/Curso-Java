package edu.aula67;

public class MinhaThread extends Thread {
    private String nome;
    private int tempo;
    public MinhaThread(String nome, int tempo){
        this.nome = nome;
        this.tempo = tempo;
        start();
    }

    public void run(){// para uma thread executar precisa sobrescrever o método run.
        //System.out.println("Executando a Thread");
        try{
            for(int i=0; i<6; i++){
                System.out.println(nome+ " Contador "+i);
                Thread.sleep(tempo);
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Terminou a execução");

    }


}
