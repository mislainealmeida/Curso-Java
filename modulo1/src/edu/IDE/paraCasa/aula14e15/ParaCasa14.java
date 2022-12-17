package edu.paraCasa.aula14e15;

import java.util.Scanner;

public class ParaCasa14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota do aluno");
        double nota1= scan.nextDouble();

        System.out.println("Digite a segunda nota do aluno");
        double nota2= scan.nextDouble();

        double media= (nota1+nota2)/2;
        String aproveitamento=" ";

        if(media<=4){
            aproveitamento="E";
        } else if (media>4 && media <=6) {
            aproveitamento="D";;
        } else if (media >6 && media <=7.5) {
            aproveitamento="C";;
        } else if (media >7.5 && media>=9) {
            aproveitamento="B";;
        }else{
            aproveitamento="A";;
        }

        switch(aproveitamento){
            case "A":
            case "B":
            case "C":
                System.out.println("APROVADO"); break;
            case "D":
            case "E":
                System.out.println("REPROVADO"); break;



        }

    }
}
