package edu.aula58;

public class Teste {
    public static void main(String[] args) {

        //autoboxing
        Short num7 = 1;//fazer a atribuição diretamente ao invés de criar o objeto.
        Byte num8=  10;
        Integer num9= 100;
        Long num10= 10000l;
        Float num11= 3.5f;
        Double num12= 3.55555;
        Boolean flag2= true;
        Character b = 'b';

        //do mesmo jeito que pode transformar em um objeto, pode fazer o contrário através do unboxing
        int num13= num9;//auto un-boxing
        //num9.intValue();

        num9++;//autoboxing em expressões
        System.out.println(num9);

        Integer num14= num13/num9;




    }
}
