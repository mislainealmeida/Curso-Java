package edu.paraCasa.aula37a43.paraCasa1;

public class ContaEspecial extends ContaBancaria{

    private double limite;

    public ContaEspecial() {
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "Limite=" + limite +
                super.toString();
    }

    public boolean sacar(double valorSaque){// subescrever o método (sobrecarga)
       double saldoComLimite = this.getSaldo() + limite;
       if(saldoComLimite - valorSaque > 0){
           this.setSaldo(this.getSaldo()- valorSaque);
           return true;
       }
        return false;
    }
}
