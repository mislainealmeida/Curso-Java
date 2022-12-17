package edu.paraCasa.aula24.paraCasa5;

public class Ex05 {
    public static void main(String[] args) {

        ContaCorrente conta= new ContaCorrente();

        conta.numero= "123456";
        conta.agencia="1234";
        conta.especial=false;
        conta.limiteEspecial=0;
        conta.saldo=100;

        System.out.println("Conta: "+conta.numero);
        System.out.println("Agência: "+conta.agencia);
        System.out.println("Saldo: R$"+conta.saldo);
    }
}
