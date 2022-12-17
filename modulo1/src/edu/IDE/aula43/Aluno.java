package edu.aula43;


import java.util.Arrays;

public class Aluno {
    private String curso;
    private double[] notas;

    public Aluno() {
    }

    public Aluno(String curso, double[] notas) {
        this.curso = curso;
        this.notas = notas;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas(double[] notas) {
        return this.notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Aluno " +
                "curso='" + curso + '\'' +
                ", notas=" + Arrays.toString(notas) ;
    }
}
