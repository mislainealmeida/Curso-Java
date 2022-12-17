package edu.aula30;

public class Carro {
    String marca;
    String modelo;
    int numeroPassageiro;
    double capacidadeCombustivel;
    double consumoCombustivel;

    public Carro() {}

    public Carro(String marca, String modelo, int numeroPassageiro) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroPassageiro = numeroPassageiro;
        System.out.println("Chamando construtor com três parâmetros");

    }

    public Carro(String marca, String modelo) {
        this(marca,modelo,10);
        System.out.println("Chamando construtor com dois parâmetros");
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
