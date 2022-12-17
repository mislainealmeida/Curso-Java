package edu.paraCasa.aula37a43.paraCasa1;

public class ContaBancaria {
    private String nomeCliente;
    private String numConta;
    private double saldo;


    public String getNomeCliente() {

        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {

        this.nomeCliente = nomeCliente;
    }

    public String getNumConta() {

        return numConta;
    }

    public void setNumConta(String numConta) {

        this.numConta = numConta;
    }

    public double getSaldo() {

        return saldo;
    }

    public void setSaldo(double saldo) {

        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return  "\nCliente = " + nomeCliente +
                "\nConta = " + numConta +
                "\nSaldo = " + saldo;
    }

    public void depositar(double valorDeposito){

        saldo +=valorDeposito;
    }

    public boolean sacar(double valorSaque){
        if((saldo - valorSaque)>=0){
            saldo -= valorSaque;
            return true;
        }
        return false;
    }

}
