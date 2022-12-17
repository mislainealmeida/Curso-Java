package edu.paraCasa.aula28a33.paraCasa2;

public class ContaCorrente {
    private String numeroConta;
    private String agencia;
    private boolean especial;
    private double limiteEspecial;
    private double saldo;
    private double especialUsado;

    public ContaCorrente() {}

    public ContaCorrente(String numeroConta, String agencia, boolean especial,
                         double limiteEspecial, double saldo, double especialUsado) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.especial = especial;
        this.limiteEspecial = limiteEspecial;
        this.saldo = saldo;
        this.especialUsado = especialUsado;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getEspecialUsado() {
        return especialUsado;
    }

    public void setEspecialUsado(double especialUsado) {
        this.especialUsado = especialUsado;
    }

    boolean sacar(double saque){
        if (saldo >= saque) {
            saldo -= saque;
            return true;
        } else {
            if (especial) {
                double limite = limiteEspecial + saldo;
                if (limite >= saque) {
                    System.out.println("Foi necessário usar o cheque especial.");
                    saldo -= saque;
                    return true;
                }else{
                    return false;
                }
            } else {
                return false;
            }
        }
    }
    void depositar(double valorDepositado){
        saldo += valorDepositado;

    }
    void consultarSaldo(){
        System.out.println("Saldo atual: "+saldo);
    }

    boolean verificarUsoChequeEspecial(){

        return saldo<0;
    }


}

