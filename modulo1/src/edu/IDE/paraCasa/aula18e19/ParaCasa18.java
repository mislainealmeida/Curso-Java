package edu.paraCasa.aula18e19;

import java.util.Scanner;

public class ParaCasa18 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int idades[] = new int[10];

        for (int i = 0; i < idades.length; i++){
            System.out.println("Qual a idades da posição "+i);
            idades[i]= scan.nextInt();
        }

        int maior=idades[0];//a primeira idade será a maior
        int indexMaior = 0;
        int menor=idades[0];// a primeira idade será tbm a menor
        int indexMenor= 0;

        for(int i=0; i < idades.length; i++){
            if(idades[i]<menor){
                menor= idades[i];
                indexMenor=i;
            }else if(idades[i]>maior){
                maior= idades[i];
                indexMaior=i;
            }
        }
        System.out.print("Idades: ");
        for (int i = 0; i< idades.length; i++) {
            System.out.print(idades[i] + " ");
        }
        System.out.println("");
        System.out.println("A menor idade é: "+menor+" na posição "+indexMenor);
        System.out.println("A maior idade é: "+maior+" na posição "+indexMaior);

    }
}
