package edu.aula70;

import edu.aula69.MinhaThread;

public class Teste {
    public static void main(String[] args) {
        MinhaThread thread1 = new MinhaThread("#1", 500);
        MinhaThread thread2 = new MinhaThread("#2", 500);
        MinhaThread thread3 = new MinhaThread("#3", 500);
        Thread t1= new Thread(thread1);
        Thread t2= new Thread(thread2);
        Thread t3= new Thread(thread3);

        /*t1.start();
        t2.start();
        t3.start();*/

        //todas as threads tem a prioridade normal, mas podemos modificar a prioridade delas através de um setPriority
        t1.setPriority(1);
        t2.setPriority(5);
        t3.setPriority(3);

        t1.start();
        t2.start();
        t3.start();// na maioria dos casos essa prioridade será respeitada.
        //t1.setPriority(Thread.MAX_PRIORITY);

    }
}
