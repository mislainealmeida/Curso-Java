package edu.aula29;

public class Carro {
    String marca;
    String modelo;
    int numeroPassageiro;
    double capacidadeCombustivel;
    double consumoCombustivel;

    Carro() {
        System.out.println("A classe Carro foi instanciada.");
        numeroPassageiro=4;
    }

    Carro(String marca_){
        marca = marca_;
    }
    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + capacidadeCombustivel * consumoCombustivel);
    }

    double obterAutonomia(){
        System.out.println("Método obter autonomia foi chamado. ");
        return capacidadeCombustivel*consumoCombustivel;
    }

    double CalcularCombustivel(double km){
        double qtdCombustivel = km/consumoCombustivel;
        return qtdCombustivel;
    }
}


