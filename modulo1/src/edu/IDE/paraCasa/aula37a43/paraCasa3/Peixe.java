package edu.paraCasa.aula37a43.paraCasa3;

public class Peixe extends Animal {
    private String caracteristicas;

    public Peixe() {
        super();
        this.setQtdePata(0);
        this.setAmbiente("Mar");
        this.setCor("Cinzento");
        caracteristicas= "Barbatanas e cauda";
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristica) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nCaracteristicas: " + caracteristicas;
    }
}
