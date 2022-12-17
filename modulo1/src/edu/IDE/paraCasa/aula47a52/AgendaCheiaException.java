package edu.paraCasa.aula47a52;

public class AgendaCheiaException extends Exception {

    @Override
    public String getMessage() {
        return "Agenda já está cheia";
    }

}
