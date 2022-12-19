package edu.aula85a100;

import java.util.Calendar;

public class Aula87 {
    public static void main(String[] args) {

        Calendar hoje = Calendar.getInstance(); //singleton=>já retorna uma instancia, sem precisar do usuario instanciar o objeto.

        int ano = hoje.get(Calendar.YEAR);
        int mes = hoje.get(Calendar.MONTH);
        int dia = hoje.get(Calendar.DAY_OF_MONTH);
        int hora = hoje.get(Calendar.HOUR_OF_DAY);
        int minutos = hoje.get(Calendar.MINUTE);
        int segundos = hoje.get(Calendar.SECOND);

        System.out.printf("Hoje é : %02d/%02d/%d %02d:%02d:%02d",
                dia, (mes+1), ano, hora, minutos, segundos);

        hoje.add(Calendar.DAY_OF_MONTH, -2);//diminuir dois dias

        hoje.add(Calendar.DAY_OF_MONTH, 5);//aumentar 5 dias

        System.out.println();

        System.out.println(hoje.get(Calendar.DAY_OF_MONTH));

    }

}
