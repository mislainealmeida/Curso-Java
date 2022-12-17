package edu.paraCasa.aula14e15;

import java.util.Scanner;

public class ParaCasa16 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor de A");
        double a= scan.nextDouble();

        if(a!=0){
            System.out.println("Digite o valor de B");
            double b= scan.nextDouble();

            System.out.println("Digite o valor de C");
            double c= scan.nextDouble();

            double delta= Math.pow(b,2)-(4*a*c);
            System.out.println("O valor de delta é :"+delta);

            if(delta <0){
                System.out.println("A equação não possui raizes reais");
            }else{
                double x1 = ((-b)+Math.sqrt(delta))/(2*a);
                double x2 = ((-b)-Math.sqrt(delta))/(2*a);
                System.out.println("A equação possui duas raizes reais: X1= "+x1+" e X2= "+x2);
            }
        }
    }
}
