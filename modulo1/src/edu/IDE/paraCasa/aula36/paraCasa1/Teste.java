package edu.paraCasa.aula36.paraCasa1;


import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Agenda agenda = new Agenda();
        System.out.println("Entre com o nome da agenda ");
        String nomeAgenda= scan.nextLine();
        agenda.setNome(nomeAgenda);

        Contato[] contatos= new Contato[3];
        for(int i=0; i<3; i++){
            System.out.println("Entre com as informações do contato "+(i+1));
            Contato contato = new Contato();
            System.out.println("Entre com o nome");
            String nome= scan.nextLine();
            contato.setNome(nome);
            System.out.println("Entre com o e- mail");
            String email= scan.nextLine();
            contato.setEmail(email);
            System.out.println("Entre com o telefone");
            String telefone= scan.nextLine();
            contato.setTelefone(telefone);

            contatos[i]=contato;
        }
        agenda.setContatos(contatos);

        if(agenda != null ){
            System.out.println(agenda.obterInfo());
        }

    }
}
