package edu.paraCasa.aula25a27.paraCasa3;

public class Aluno {
    String nome;
    String matricula;
    String curso;
    String[] disciplinas;
    double[][] notas;
    double media;

    void mostrarInformacoes() {
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


    double obterMedia(int indice){

        double soma = 0;

        for (int i=0; i<notas[indice].length; i++){
            soma += notas[indice][i];
        }

        media = soma / 4;

        return media;
    }
    boolean verificarAprovado(int indice){

        if (obterMedia(indice) >= 7){
            return true;
        }

        return false;
    }
}
