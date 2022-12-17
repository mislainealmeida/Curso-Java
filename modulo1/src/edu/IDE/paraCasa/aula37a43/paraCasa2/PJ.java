package edu.paraCasa.aula37a43.paraCasa2;

public  class PJ extends Contribuinte{

    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public double calcularIR() {
        return this.getRendaBruta() * 0.10;// usa o this para mostrar que o atributo é dessa classe.
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nCNPJ: '" + cnpj+
                "\nImposto a ser pago: R$"+calcularIR()+
                "\n";
    }
}
