package edu.aula68;


public class Teste {
    public static void main(String[] args) {

        MinhaThreadRunnable thread1= new MinhaThreadRunnable("#1", 500);
        //apenas implementa a Thread, não é uma Thread, para ter a thread precisa passa a classe Runnable para a thread

        //Thread t1= new Thread(thread1);//pode fazer direto no construtor
        //t1.start();// pode fazer direto no construtor


    }
}
