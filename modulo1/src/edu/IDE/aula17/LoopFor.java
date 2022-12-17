package edu.aula17;

public class LoopFor {
    public static void main(String[] args) {
        //for com uma variável
        for(int i=0;i < 5;i++){
            System.out.println("Valor de i: "+i);
        }
        for(int i= 5;i > 0;i--){
            System.out.println("Valor de i: "+i);
        }
        //for com mais de uma variável.
        for(int i=0, j=10; i<=j; i++, j--){
            System.out.println("i = "+i+ "; j= "+j);
        }
        //partes ausentes
        int count=0;
        for(;count < 10;){
            System.out.println("Valor de count: "+count);
            count +=2;
        }
        //partes presentes
        for (int cont=0; cont<10; cont+=2){
            System.out.println("Valor de cont: "+cont);
        }

        /*loop infinito
       for(;;){

        }*/
        //loop sem corpo
        int soma=0;
        for (int i=1; i<5; soma +=i++){}
        System.out.println("O valor da soma é "+soma);

    }
}
