package edu.paraCasa.aula28a33.paraCasa2;


public class Ex02 {
    public static void main(String[] args) {
        ContaCorrente conta= new ContaCorrente();

        conta.setNumeroConta("123456");
        conta.setAgencia("1234");
        conta.setEspecial(true);
        conta.setLimiteEspecial(500);
        conta.setSaldo(-10);

        System.out.println("Tentativa de saque de R$ 10,00");
        boolean saqueEfetuada= conta.sacar(10);
        if(saqueEfetuada){
            System.out.println("Saque efetuado com sucesso.");
            conta.consultarSaldo();
        }else{
            System.out.println("Não foi possível realizar saque. Saldo insuficiente.");
        }

        System.out.println();
        System.out.println("Tentativa de saque de R$ 500,00");
        saqueEfetuada= conta.sacar(500);
        if(saqueEfetuada){
            System.out.println("Saque efetuado com sucesso.");
            conta.consultarSaldo();
        }else{
            System.out.println("Não foi possível realizar saque. Saldo insuficiente.");
        }

        System.out.println();
        System.out.println("Tentativa de saque de R$ 50,00");
        saqueEfetuada= conta.sacar(50);
        if(saqueEfetuada){
            System.out.println("Saque efetuado com sucesso.");
            conta.consultarSaldo();
        }else{
            System.out.println("Não foi possível realizar saque. Saldo insuficiente.");
        }
        System.out.println();
        System.out.println("Depósito de R$50,00");
        conta.depositar(50);
        conta.consultarSaldo();

        System.out.println();
        if(conta.verificarUsoChequeEspecial()){
            System.out.println("Esta usando cheque especial.");
        }else{
            System.out.println("Não esta usando o cheque especial. ");
        }

        System.out.println();
        System.out.println("Depósito de R$100,00");
        conta.depositar(100);
        conta.consultarSaldo();
        if(conta.verificarUsoChequeEspecial()){
            System.out.println("Está usando cheque especial.");
        }else{
            System.out.println("Não está usando o cheque especial. ");
        }
    }
}

