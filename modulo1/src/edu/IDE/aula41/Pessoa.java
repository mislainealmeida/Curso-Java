package edu.aula41;

public abstract  class Pessoa {
    protected String nome;
    private String endereco;
    private String telefone;

    private String telefoneCelular;
    private String cpf;

    public Pessoa() {
    }

    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getEndereco() {

        return endereco;
    }

    public void setEndereco(String endereco) {

        this.endereco = endereco;
    }

    public String getTelefoneCelular() {

        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {

        this.telefoneCelular = telefoneCelular;
    }

    public String getTelefone() {

        return telefone;
    }

    public void setTelefone(String telefone) {

        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String obterEtiquetaEndereco(){
        return endereco;
    }

    public abstract void imprimirEtiquetaEndereco();
}
