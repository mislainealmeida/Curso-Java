package edu.aula10;

public class Variaveis {
    public static void main(String[] args) {

        //convenção Java
        int idade =20;
        String nome = "Mislaine";
        String nomeDoMeuGato = "Charllote";
        String ano2014 = "2014";

        //aceito mas não é utilizado
        int _idade;
        int $idade;


        //não é convenção Java
        String nome_do_meu_gato;
        String NomeDoMeuGato;
        String NomeDoMeugato;

        idade = 25;
        System.out.println("Idade = "+ idade);
        System.out.println("Nome = "+ nome);

        // má prática
        int a = 10;
        String b = "Mislaine";


    }
}
