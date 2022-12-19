package edu.aula65;

@interface InformacaoAula {
    String autor();
    int aulaNumero();
    String blog() default "loiane.com";
    String site()default "http://loiane.training";
}
