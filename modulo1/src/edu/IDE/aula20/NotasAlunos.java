package edu.aula20;

public class NotasAlunos {
    public static void main(String[] args) {
      double[][] notasAlunos = new double[30][4];
        notasAlunos[0][0]=10;
        notasAlunos[0][1]=7;
        notasAlunos[0][2]=8;
        notasAlunos[0][3]=9.5;

        notasAlunos[1][0]=9;
        notasAlunos[1][1]=8;
        notasAlunos[1][2]=7;
        notasAlunos[1][3]=9;

        notasAlunos[2][0]=8;
        notasAlunos[2][1]=9;
        notasAlunos[2][2]=10;
        notasAlunos[2][3]=7;

        for(int i=0; i<notasAlunos.length; i++){
          for(int j=0; j<notasAlunos[i].length; j++){
            System.out.println("Nota "+(j+1)+" do aluno "+(i+1) +": "+ notasAlunos[i][j]+" ");
          }
          System.out.println();
        }
        notasAlunos[1][3]= 8;
        double soma;
      System.out.println("Calculando a média de cada aluno: ");
      for(int i=0; i<notasAlunos.length; i++){
        soma=0;
        for(int j=0; j<notasAlunos[i].length; j++){
          soma +=notasAlunos[i][j];
        }
        System.out.println("Média do aluno: "+i+" é: "+(soma/4));
      }

    }
}
