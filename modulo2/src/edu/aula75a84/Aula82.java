package edu.aula75a84;

public class Aula82 {
    public static void main(String[] args) {

        //os parametros usados são do tipo varargs
        //podemos ter infinitos parametros, sempre do mesmo tipo.
        String alfabeto = String.join(", ", "A", "B", "C", "D");
        System.out.println(alfabeto);

        //split é usado para separar(no caso separamos tirando o espaço e vírgula).
        String[] letras = alfabeto.split(", ");
        for (String letra : letras){
            System.out.println(letra);
        }

        String doArquivo = "1;Antônio;30;";
        String[] infos = doArquivo.split(";");

        Aula82Pessoa pessoa = new Aula82Pessoa(Integer.parseInt(infos[0]),
                infos[1], Integer.parseInt(infos[2]));
        System.out.println(pessoa);
    }
}
