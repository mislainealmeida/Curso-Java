package edu.paraCasa.aula14e15;

import java.util.Scanner;

public class ParaCasa19 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Dígite o primeiro número");
        int num1 = scan.nextInt();
        System.out.println("Digite o segundo número");
        int num2= scan.nextInt();
        System.out.println("Qual operação deseja realizar? ");
        System.out.println("Subtracao (-), Adição (+), Multiplicação (*) e Divisão (/)");
        String operacao= scan.next();

        int total=0;
        boolean valida= true;

        switch(operacao){
            case"+":
                total= num1+num2; break;
            case"-":
                total= num1-num2; break;
            case"*":
                total= num1*num2; break;
            case"/":
                total= num1/num2; break;
            default:
                System.out.println("Operação inválida");
                valida= false;
        }
        if(valida){
            System.out.println("Resultado: "+ total);
            if(total>=0){
                System.out.println("Positivo");
            } else{
                System.out.println("Negativo");
            }

            if(total%2==0){
                System.out.println("Resultado PAR");
            }else{
                System.out.println("Resultado ÍMPAR");
            }
        }
    }
}
