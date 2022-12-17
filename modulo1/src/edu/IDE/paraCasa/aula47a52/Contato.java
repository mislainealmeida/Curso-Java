package edu.paraCasa.aula47a52;

public class Contato {
    private int contador=0;
    private String nome;
    private String telefone;
    private int id;

    public Contato() {//se vc não quer que a pessoa tenha acesso ao atributo é so não gerar o set/get.
        contador ++;
        id= contador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdentificador() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Contato " + id +":"+
                "\nNome: " + nome  +
                "\nTelefone: " + telefone+
                "\n";
    }
}
