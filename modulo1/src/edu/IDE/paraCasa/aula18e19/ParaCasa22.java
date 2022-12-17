package edu.paraCasa.aula18e19;


public class ParaCasa22 {
    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int qtd0 = 0;
        int qtd1 = 0;


        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) Math.round(Math.random() * 1);
            //Math.random- gera um número de 0 a 1.
            //Math.round- irá arredondar o número.
            // precisa da conversão para inteiro, por ser Math ser double.

            if (vetorA[i] == 0) {
                qtd0++;
            } else {
                qtd1++;
            }
        }
        double porcentagem0 = (qtd0 * 100)/ vetorA.length;
        double porcentagem1 = (qtd1 *100)/ vetorA.length;

        System.out.print("Vetor A= ");
        for (int i=0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("Porcentagem 0= "+porcentagem0+"%");
        System.out.println("Porcentagem 1= "+porcentagem1+"%");
    }
}

