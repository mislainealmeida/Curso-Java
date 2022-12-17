package edu.paraCasa.aula16e17;

import java.util.Scanner;

public class ParaCasa2 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        boolean senhaValida= false;


        do{
            System.out.println("Digite o nome: ");
            String nome = scan.next();
            System.out.println("Digite a senha: ");
            String senha= scan.next();
            if(nome.equalsIgnoreCase(senha)){
                System.out.println("Senha inválida.");
            }else{
                senhaValida=true;
                System.out.println("Usuário e senha válidos.");
            }


        }while(!senhaValida);
    }
}
