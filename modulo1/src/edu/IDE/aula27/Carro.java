package edu.aula27;

public class Carro {
    String marca;
    String modelo;
    int numeroPassageiro;
    double capacidadeCombustivel;
    double consumoCombustivel;

    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + capacidadeCombustivel * consumoCombustivel);
    }

    double obterAutonomia(){
        System.out.println("Método obter autonomia foi chamado. ");
        return capacidadeCombustivel*consumoCombustivel;
    }

    double CalcularCombustivel(double km){//parametro km, quando vamos utilizar o parametro vira argumento.
        double qtdCombustivel = km/consumoCombustivel;
        return qtdCombustivel;
    }
}
