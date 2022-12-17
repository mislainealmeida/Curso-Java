package edu.paraCasa.aula28a33.paraCasa3;

public class Aluno {
    private String nome;
    private String matricula;
    private String curso;
    private String[] disciplinas;
    private double[][] notas;
    private double media;

    public Aluno() {
        disciplinas= new String[3];
        notas= new double[3][4];
    }

    public Aluno(String nome, String matricula, String curso,
                 String[] disciplinas, double[][] notas, double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.disciplinas = new String[3];
        this.notas = new double[3][4];
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public double[][] getNotas() {
        return notas;
    }

    public void setNotas(double[][] notas) {
        this.notas = notas;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Curso: " + curso);
        System.out.println("Matrícula: " + matricula);

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Notas da disciplina: " + disciplinas[i]);
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println("Nota " + (j + 1) + ": " + notas[i][j]);
            }
        }
    }


    private double obterMedia(int indice){

        double soma = 0;

        for (int i=0; i<notas[indice].length; i++){
            soma += notas[indice][i];
        }

        media = soma / 4;

        return media;
    }
    public boolean verificarAprovado(int indice){

        if (obterMedia(indice) >= 7){
            return true;
        }

        return false;
    }

    public void setDisciplinasPos(int pos, String disciplina){
        this.disciplinas[pos]=disciplina;
    }
    public void setNotasPosIJ(int posI, int posJ, double notas){
        this.notas[posI][posJ]= notas;
    }

}
