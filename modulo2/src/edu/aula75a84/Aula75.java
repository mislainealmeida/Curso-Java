package edu.aula75a84;

public class Aula75 {
    public static void main(String[] args) {

        //atribuição simples = id é o mesmo, pois as variáveis são iguais, apontam para o mesmo endereço de memória do java.
        //já existe o pool? não, então cria uma referência.
        //se já existe, então usa a mesma referência.

        //atribuição por instancia (new)= o java esta alogando espaço na memória pra essa variável(referencia de memória). (id diferente)

        String vazia = new String(); //""
        System.out.println(vazia);

        String java = new String("JAVA");
        System.out.println(java);

        String java1 = new String(java);
        System.out.println(java1);

        char[] charsJava = {'J', 'A', 'V', 'A'};//caracteres no java é com aspas simples
        String java2 = new String(charsJava);
        System.out.println(java2);

        char[] abcdef = {'A', 'B', 'C', 'D', 'E', 'F'};
        String abc = new String(abcdef, 0, 3);
        System.out.println(abc);

        byte[] ascii = {65, 66, 67, 68, 69};
        String abcde = new String(ascii);
        System.out.println(abcde);

        String bcd = new String(ascii, 1, 3);
        System.out.println(bcd);

        String java3 = "JAVA";
        String java4 = "JAVA";

        System.out.println(java3);
        System.out.println(java4);
    }

}
