package edu.aula29;

public class TesteCarro {
    public static void main(String[] args) {
        Carro van= new Carro();
        van.marca= "Fiat";
        van.modelo="Ducato";
       // van.numeroPassageiro=10;
        van.capacidadeCombustivel=100;
        van.consumoCombustivel=0.2;

        System.out.println(van.numeroPassageiro);

        Carro van2= new Carro("Fiat");// posso incluir quantos parametros quiser
        van2.modelo="Ducato";
        System.out.println(van2.marca);
    }
}
