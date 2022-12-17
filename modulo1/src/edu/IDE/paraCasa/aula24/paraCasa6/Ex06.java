package edu.paraCasa.aula24.paraCasa6;

public class Ex06 {
    public static void main(String[] args) {

        Contato contato1= new Contato();

        contato1.nome= "Eduardo";
        contato1.email= "edu@gmail.com";
        contato1.endereco= "Rua Vinte e seis, 50";
        contato1.telefones = new String[2];
        contato1.telefones[0]="11 1111-1111";
        contato1.telefones[1]="11 91111-1111";


        Contato contato2= new Contato();

        contato2.nome= "Mônica";
        contato2.email= "monica@gmail.com";
        contato2.endereco= "Rua Girassol, 150";
        contato2.telefones = new String[2];
        contato2.telefones[0]="11 2222-2222";
        contato2.telefones[1]="11 92222-2222";

        System.out.println(contato1.nome);
        System.out.println(contato1.telefones[1]);
        System.out.println();

        System.out.println(contato2.nome);
        System.out.println(contato2.telefones[1]);



    }
}
