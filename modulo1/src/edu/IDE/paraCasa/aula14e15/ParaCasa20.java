package edu.paraCasa.aula14e15;

import java.util.Scanner;

public class ParaCasa20 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("1- Telefonou para a vítima? S/N");
        String r1 = scan.next();
        System.out.println("2- Esteve no locar do crime? S/N");
        String r2 = scan.next();
        System.out.println("3- Morava perto da vítima? S/N");
        String r3 = scan.next();
        System.out.println("4- Devia para a vítima? S/N");
        String r4 = scan.next();
        System.out.println("5- Já trabalhou para a vítima? S/N");
        String r5 = scan.next();
        int cont=0;

        if(r1.equalsIgnoreCase("S")){
            cont++;
        }
        if(r2.equalsIgnoreCase("S")){
            cont++;
        }
        if(r3.equalsIgnoreCase("S")){
            cont++;
        }
        if(r4.equalsIgnoreCase("S")){
            cont++;
        }
        if(r5.equalsIgnoreCase("S")){
            cont++;
        }
        if(cont<=2){
            System.out.println("Suspeito");
        }else if(cont<=4 ){
            System.out.println("Cúmplice");
        } else if (cont==5) {
            System.out.println("Assassino");
        }else if(cont ==0){
            System.out.println("Inocente");
        }


    }
}
