package edu.aula69;

public class Teste3 {
    public static void main(String[] args) {

        MinhaThread thread1 = new MinhaThread("#1", 500);
        MinhaThread thread2 = new MinhaThread("#2", 700);
        MinhaThread thread3 = new MinhaThread("#3", 800);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        t1.start();

		/*try {
			t1.join(200);// garante a execução da tread para continuar com o código
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/


        t2.start();//só vai iniciar depois que a tread 1 terminar ou de 200 milisegundos que a thread 1 for inicializada

		/*try {
            t2.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }*/

       t3.start();


        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Programa finalizado");
    }
}
