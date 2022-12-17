package edu.aula13;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int resultado = 1+2;
        System.out.println(resultado);

        resultado = resultado-1;
        System.out.println(resultado);

        resultado = resultado * 2;
        System.out.println(resultado);

        resultado = resultado/2;
        System.out.println(resultado);

        resultado = resultado +8;
        System.out.println(resultado);

        resultado = resultado % 7;
        System.out.println(resultado);

        String primeiroNome = "Esta é ";
        String segundoNome = "uma String concatenada.";
        String terceitoNome = primeiroNome + segundoNome;
        System.out.println(terceitoNome);

        resultado = resultado+1;
        System.out.println(resultado);

        resultado++;
        System.out.println(resultado);

        //5
        System.out.println(resultado++);
        System.out.println(++resultado);
    }
}
