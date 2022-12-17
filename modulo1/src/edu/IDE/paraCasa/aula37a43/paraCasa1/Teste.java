package edu.paraCasa.aula37a43.paraCasa1;

public class Teste {
    public static void main(String[] args) {

        System.out.println("*** Conta Bancária ***");
        ContaBancaria contaSimples = new ContaBancaria();
        contaSimples.setNomeCliente("Ana");
        contaSimples.setNumConta("1234-0");
        System.out.println(contaSimples+"\n");
        contaSimples.depositar(100);
        realizarSaque(contaSimples, 50);
        realizarSaque(contaSimples,70);
        System.out.println("\nSaldo: "+ contaSimples.getSaldo());

        System.out.println("\n*** Conta Poupanca ***");
        ContaPoupanca poupanca= new ContaPoupanca();
        poupanca.setNomeCliente("João");
        poupanca.setNumConta("5678-0");
        poupanca.setDiaRendimento(7);
        poupanca.depositar(500);
        realizarSaque(poupanca, 100);
        realizarSaque(poupanca,600);
        if(poupanca.calcularNovoSaldo(0.5)){
            System.out.println("Rendimento aplicado, novo saldo é de R$ "+poupanca.getSaldo());
        }else{
            System.out.println("Hojé não houve rendimento.");
        }
        System.out.println("\nSaldo: "+ poupanca.getSaldo());


        System.out.println("\n*** Conta PEspecial***");
        ContaEspecial especial= new ContaEspecial();
        especial.setNomeCliente("José");
        especial.setNumConta("1111-0");
        especial.depositar(300);
        realizarSaque(especial, 100);
        realizarSaque(especial,500);
    }



    public static void realizarSaque (ContaBancaria conta, double valorSaque){//ContaPoupanca extends ContaBancária portanto a ContaPoupanca não deixa de ser contaBancaria.
        if (conta.sacar(valorSaque)){
            System.out.println("Saque efetuado com sucesso, novo saldo = " + conta.getSaldo());
        } else {
            System.out.println("Saldo insuficiente");
        }

    }





}
