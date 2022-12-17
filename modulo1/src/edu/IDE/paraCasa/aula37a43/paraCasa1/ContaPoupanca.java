package edu.paraCasa.aula37a43.paraCasa1;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria{
    private int diaRendimento;// dia do rendimento

    public ContaPoupanca() {
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    @Override
    public String toString() {
        return "Rendimento do dia = R$ " + diaRendimento +
                super.toString();
    }


    public boolean calcularNovoSaldo(double taxaRendimento){

        Calendar hoje = Calendar.getInstance();// para obter a data de hoje.
        if(diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)){// se o dia do rendimento for igual a data de hj;
           //saldo = saldo +(saldo * taxaRendimento) ou seja saldo += saldo * taxaRendimento
            this.setSaldo(this.getSaldo()+ this.getSaldo() * taxaRendimento);
            return true;
        }
        return false;
    }
}
