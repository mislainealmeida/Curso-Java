package edu.aula75a84;

import java.util.Arrays;

public class Aula77 {
    public static void main(String[] args) {

        String java = "Java";

        for (int i=0; i<java.length(); i++){
            System.out.println(java.charAt(i));//saída: um em cada linha
        }

        char[] jav = new char[3];
        java.getChars(0, 3, jav, 0);
        System.err.println(jav);

        //System.out é o output padrão do sistema que você está usando. System.err é o output padrão de erros do sistema.
        //Em uma aplicação console normal, ambos provavelmente irão printar no console. Mas você pode reconfigurar os outputs para, por exemplo, fazer os erros printarem em um arquivo de texto, e deixar o System.out printar na tela.

        //seria o mesmo que
        for (int i=0, j=0; i<3; i++, j++){
            jav[j] = java.charAt(i);
        }
        System.out.println(jav);

        byte[] javBytes = new byte[3];
        java.getBytes(0, 3, javBytes, 0);
        System.out.println(Arrays.toString(javBytes));

        char[] javaChars = java.toCharArray();
        System.out.println(javaChars);
    }
}
