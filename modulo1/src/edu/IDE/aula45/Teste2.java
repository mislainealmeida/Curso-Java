package edu.aula45;

public class Teste2 {
    public static void main(String[] args) {
        Object obj1= obterString();// object é a classe mãe de todas
        String s1=(String) obj1;

        Object obj2= "Minha String";//upcasting
        String s2= (String) obj2;//downcasting

        Object obj3= new Object();
        String s3= (String) obj3;

        Object obj4= new Object();
        String s4= (String) obj4;

    }

    public static String obterString(){
        return "minha String";
    }

    public static int obterInt(){
        return 1;
    }
}
