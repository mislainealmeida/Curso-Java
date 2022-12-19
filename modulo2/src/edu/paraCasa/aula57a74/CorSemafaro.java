package edu.paraCasa.aula57a74;

public enum CorSemafaro {
    VERDE(1000), AMARELO(300), VERMELHO(2000);

    private int tempoEspera;

    CorSemafaro(int tempoEspera){
        this.tempoEspera = tempoEspera;
    }

    public int getTempoEspera() {
        return tempoEspera;
    }
}

