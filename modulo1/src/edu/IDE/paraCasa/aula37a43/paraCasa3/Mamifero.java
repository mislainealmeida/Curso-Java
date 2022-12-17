package edu.paraCasa.aula37a43.paraCasa3;

public class Mamifero extends Animal{
    private String alimento;

    public Mamifero() {
        super();
        this.setCor("castanho");
        alimento = "Mel";
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nAlimento: " + alimento;
    }
}
