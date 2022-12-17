package edu.paraCasa.aula37a43.paraCasa2;

public abstract  class Contribuinte {

    private String nome;
    private double rendaBruta;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    public abstract  double calcularIR();

    @Override
    public String toString() {
        return "Nome: '" + nome + '\'' +
                "\nRenda Bruta: R$" + rendaBruta;
    }
}
