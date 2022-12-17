package edu.paraCasa.aula25a27.paraCasa1;

public class Lampada {
    String marca;
    String modelo;
    String cor;
    int potencia;
    String[] tipos;
    int garantiaMeses;
    boolean ligada;

    void ligarLampada() {
        ligada = true;
        System.out.println("Lâmpada ligada");
    }
    void desligarLampada(){
        ligada=false;
            System.out.println("Lâmpada desligada");
    }

}

