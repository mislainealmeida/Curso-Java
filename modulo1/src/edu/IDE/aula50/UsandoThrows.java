package edu.aula50;

import java.util.Scanner;

public class UsandoThrows {
    public static void main(String[] args){//2- posso colocar thorows e jogar para tratar para frente, ou tratar agora
        System.out.println("Entre com um número decimal");

        try{
            double numero= leNumero();
            System.out.println("Você digitou "+numero);
        }catch (Exception e){
            System.out.println("Entrada inválida");
            e.printStackTrace();//não usar stackTrace para o usuário final, por questão de segurança e estética.
        }
    }
    public static double leNumero() throws Exception{//1- deixei para tratar depois
        Scanner scan= new Scanner(System.in);
        double numero= scan.nextDouble();
        return numero;
    }
}
