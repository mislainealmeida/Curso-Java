package edu.paraCasa.aula25a27.paraCasa2;

public class ContaCorrente {

    String numeroConta;
    String agencia;
    boolean especial;
    double limiteEspecial;
    double saldo;
    double especialUsado;


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
