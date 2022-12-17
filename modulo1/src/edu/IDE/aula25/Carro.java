package edu.aula25;

public class Carro {
    String marca;
    String modelo;
    int numeroPassageiro;
    double capacidadeCombustivel;
    double consumoCombustivel;

    void exibirAutonomia(){
        System.out.println("A autinomia do carro é: "+capacidadeCombustivel*consumoCombustivel);
    }


}
