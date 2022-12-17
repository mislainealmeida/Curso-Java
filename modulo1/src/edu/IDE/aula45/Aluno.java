package edu.aula45;


public class Aluno extends Pessoa {
    private String curso;
    private double[] notas;

    public String verificarAcesso(){
        return super.nome="Maria";
    }

    public Aluno() {

        super();
    }

    public Aluno(String nome, String endereco, String telefone, String curso) {
        super(nome, endereco, telefone);
        this.curso = curso;
    }

    public String getCursos() {
        return curso;
    }

    public void setCursos(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        return 0;
    }

    public String verificarAprovado() {
        return "0";
    }

    public String obterEtiquetaEndereco(){
        String s = "Endereço do aluno: ";
        s += super.getEndereco();
        return s;
    }


}
