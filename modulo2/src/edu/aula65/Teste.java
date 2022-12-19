package edu.aula65;

/*@InformacaoAula(
    autor= "Loiane";
    aulaNumero = 65;
)*/
//existem anotações que não precisa passar nenhuyma informação, neste caso precisa.


public class Teste {
    @InformacaoAula(
            autor = "Loiane",
            aulaNumero = 65,
            blog = "loiane.com"
    )
    public static void main(String[] args) {

    }
}
