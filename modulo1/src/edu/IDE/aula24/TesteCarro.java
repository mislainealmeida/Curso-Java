package edu.aula24;

public class TesteCarro {
    public static void main(String[] args) {
        Carro van= new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numeroPassageiro= 10;
        van.capacidadeCombustivel= 100;
        van.consumoCombustivel= 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);
        System.out.println(van.numeroPassageiro);

        Carro fusca= new Carro();
        van.marca = "Volkswagen";
        van.modelo = "Fusca";
        van.numeroPassageiro= 4;
        van.capacidadeCombustivel= 30;
        van.consumoCombustivel= 0.15;

        System.out.println(van.marca);
        System.out.println(van.modelo);
        System.out.println(van.numeroPassageiro);


    }
}
