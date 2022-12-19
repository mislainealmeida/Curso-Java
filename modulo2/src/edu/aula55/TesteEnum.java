package edu.aula55;


import edu.aula54.DiaSemana;

public class TesteEnum {
    public static void main(String[] args) {
        DiaSemana[] dias = DiaSemana.values();

        for(int i=0; i<dias.length; i++){
            System.out.println(dias[i]);
        }
        System.out.println("\nTambém pode ser feito através do for melhorado:\n");
        for(DiaSemana dia: DiaSemana.values()){
            System.out.println(dia);
        }
    }
}
