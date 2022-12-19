package edu.aula69;


public class Teste {
    public static void main(String[] args) {
        MinhaThread thread1 = new MinhaThread("#1", 500);
        MinhaThread thread2 = new MinhaThread("#2", 500);
        MinhaThread thread3 = new MinhaThread("#3", 500);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        t1.start();
        t2.start();
        t3.start();

        for (int i = 0; i < 7; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Programa finalizado");
    }

}

