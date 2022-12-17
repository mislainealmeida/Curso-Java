package edu.paraCasa.aula37a43.paraCasa3;

public class Animal{
    private String nome;
    private double comprimento;
    private int qtdePata;
    private String cor;
    private String ambiente;
    private double velocidade;

    public Animal() {
        qtdePata = 4;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public int getQtdePata() {
        return qtdePata;
    }

    public void setQtdePata(int qtdePata) {
        this.qtdePata = qtdePata;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "--------------------------------"+
                "\nAnimal: " + nome +
                "\nComprimento: " + comprimento +" cm "+
                "\nPatas: " + qtdePata +
                "\nCor: " + cor +
                "\nAmbiente: " + ambiente +
                "\nVelocidade: " + velocidade +" m/s ";
    }
}
