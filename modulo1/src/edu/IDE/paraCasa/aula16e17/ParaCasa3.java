package edu.paraCasa.aula16e17;

import java.util.Scanner;

public class ParaCasa3 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String nome, sexo, estadoCivil;
        int idade;
        double salario;
        boolean infoValida=false;

        do{
            System.out.println("Digite um nome: ");
             nome= scan.next();
            if(nome.length()<3){
                System.out.println("Nome inválido, tente novamente.");
            }else{
                infoValida=true;
            }
        }while(!infoValida);
        infoValida=false;

        do{
            System.out.println("Digite a idade: ");
            idade= scan.nextInt();
            if (idade>=0 && idade<=150){
                infoValida=true;
            }else{
                System.out.println("Idade inválida, tente novamente.");
            }
        }while (!infoValida);
        infoValida=false;

        do{
            System.out.println("Digite o salário: ");
            salario= scan.nextDouble();
            if (salario<=0){
                System.out.println("Salário inválido, tente novamente.");
            }else{
                infoValida = true;
            }
        }while (!infoValida);
        infoValida=false;

        do{
            System.out.println("Digite o sexo (F-femino e M-masculino): ");
            sexo= scan.next();
            if(sexo.equalsIgnoreCase("f")|| sexo.equalsIgnoreCase("m")){
                infoValida=true;
            }else{
                System.out.println("Sexo inválido, tente novamente.");
            }

        }while(!infoValida);
        infoValida=false;

        do{
            System.out.println("Digite o estado civil(S-solteiro, C-casado, V-viúvo e D-Divorciado): ");
            estadoCivil= scan.next();
            if(estadoCivil.equalsIgnoreCase("s")||
            estadoCivil.equalsIgnoreCase("c")||
            estadoCivil.equalsIgnoreCase("v")
            ||estadoCivil.equalsIgnoreCase("d")){
                infoValida= true;

            }else{
                System.out.println("Estado civil inválido, tente novamente.");
            }
        }while(!infoValida);

        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Salário: "+salario);
        System.out.println("Sexo: "+sexo);
        System.out.println("Estado civil: "+estadoCivil);

    }
}