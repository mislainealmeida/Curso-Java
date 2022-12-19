package edu.aula57;

public class Teste {
    public static void main(String[] args) {
       //tipos primitivos do Java
        short num1 = 1;
        byte num2 = 10;
        int num3 = 100;
        long num4 = 10000l;
        float num5 = 3.5f;
        double num6 = 3.55555;
        boolean flag = true;
        char a = 'a';

        //Java não é 100% Orientada a Objetos, pois tem esses tipos primitivos.
        //Temos classes representando esses tipos primitivos (classes Wrappers)


        //Short num7= new Short((short) 1);// Raramente é apropriado usar esse construtor. valueOf(int) geralmente é uma escolha melhor.
        Short num7 = Short.valueOf((short) 1);//preciso converter através de um casting
        Byte num8= Byte.valueOf((byte) 10);// valueOf transforma o numero primitivo em uma instancia de um objeto.
        Integer num9= Integer.valueOf(100);
        Long num10= Long.valueOf(10000l);
        Float num11= Float.valueOf(3.5f);
        Double num12= Double.valueOf(3.55555);
        Boolean flag2= Boolean.valueOf(true);
        Character b = Character.valueOf('b');
        //essas são as classes wrappers do Java.
        //cada classe possui seus métodos que irão retornar valores.

        System.out.println(num9.intValue());
        Long num15= num9.longValue();// consigo converter o num9(Integer para long)
        int num16= Integer.parseInt("100000");// transformar o valor de uma string em um valor numérico
        double num17= Double.parseDouble("3.5555");
        Integer num13= Integer.valueOf(100);
        System.out.println(num9 == num13);// não se compara wrappers com == e sim equals

    }
}
