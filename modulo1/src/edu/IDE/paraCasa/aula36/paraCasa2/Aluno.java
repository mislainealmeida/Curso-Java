package edu.paraCasa.aula36.paraCasa2;

public class Aluno {
    private String nomeAluno;
    private String matricula;
    private double[] notas;

    public Aluno() {
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String obterInfo() {
        String info= "Aluno:" + nomeAluno;
        info+="\n Matrícula: "+matricula;
        info+="\n Notas: ";
        double soma =0;
        for(int i=0; i<4; i++){
            soma+=notas[i];
            info+= notas[i]+ " ";
        }
        double media = soma/4;
        info+="\n"+"Média: "+media;
        if(media>=7){
            info+="\nAPROVADO";
        }else{
            info+="\nREPROVADO";
        }
        return info;
    }

    public double obterMedia(){
        double soma =0;
        for(int i=0; i<4; i++){
            soma+=notas[i];
        }
       return soma / 4;
    }
}
