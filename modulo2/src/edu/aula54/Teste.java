package edu.aula54;

public class Teste {
    public static void main(String[] args) {
        DiaSemana dia= DiaSemana.DOMINGO;//para o usuario mostro domingo, mas no meu BD guardo o valor 7 para simplificar.
        DiaSemana dia1= DiaSemana.SEGUNDA;

        System.out.println(dia.toString()+"-"+dia.getValor());
        System.out.println(dia1.toString()+"-"+dia1.getValor());

        Data data= new Data(06,12,2022,DiaSemana.TERCA);

        Formulario.Genero genero= Formulario.Genero.FEMININO;
        System.out.println(genero.toString());
    }
}
