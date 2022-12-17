package edu.paraCasa.aula14e15;

import java.util.Scanner;

public class ParaCasa23 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Entre com o tipo da carne");
        System.out.println("1- Filé duplo");
        System.out.println("2- Alcatra");
        System.out.println("3- Picanha");
        int tipo= scan.nextInt();

        System.out.println("Entre com a quantidade em Kg");
        double qtd= scan.nextDouble();
        double precoKg=0;
        if(tipo==1){
            System.out.println(qtd+" Kg de filé duplo");
            if(qtd<5){
                precoKg=4.90;
            }else{
                precoKg=5.80;
            }
        } else if (tipo==2) {
            System.out.println(qtd+" Kg de alcatra");
            if (qtd<5){
                precoKg=5.90;
            }else{
                precoKg=6.80;
            }
        } else if (tipo==3) {
            System.out.println(qtd+" Kg de picanha");
            if(qtd<5){
                precoKg=6.90;
            }else{
                precoKg=7.80;
            }
        }
        double total= qtd*precoKg;
        System.out.println(qtd+" Kg * "+precoKg+" = "+ total);
        System.out.println("Compra no cartão? 1-para sim");
        int cartao = scan.nextInt();

        if (cartao==1){
            double desconto = (total*5)/100;
            System.out.println("Desconto de R$"+desconto);
            System.out.println("valor a pagar: R$"+(total-desconto));
        }else{
            System.out.println("Valor a pagar: R$ "+total);
        }

    }
}
