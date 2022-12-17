package edu.paraCasa.aula37a43.paraCasa2;

public class PF extends Contribuinte{
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public double calcularIR() {
        double renda = this.getRendaBruta();//para facilitar e não precisar escrever o this.getRendaBruta toda hora.
        if (renda <= 1400){
            return 0;
        }
        if (renda > 1400 && renda <= 2100){//não precisa usar else, somente o if. Pois como tem o return, já retorna algo.
            return (renda * 0.1) - 100;
        }
        if (renda > 2100 && renda <= 2800){
            return (renda * 0.15) - 270;
        }
        if (renda > 2800 && renda <= 3600){
            return (renda * 0.25) - 500;
        }
        return (renda * 0.3) - 700;// maior que 3600
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nCPF: '" + cpf+
                "\nImposto a ser pago: R$"+calcularIR()+
                "\n";
    }
}
