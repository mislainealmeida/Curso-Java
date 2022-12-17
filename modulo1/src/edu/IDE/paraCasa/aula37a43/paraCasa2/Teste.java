package edu.paraCasa.aula37a43.paraCasa2;

public class Teste {
    public static void main(String[] args) {
        PF p1 = new PF();
        p1.setNome("Contribuinte 01");
        p1.setCpf("774.912.060-26");
        p1.setRendaBruta(1200);
        //System.out.println(pf1.toString()); caso não use um array e o for será necessário colocar um sout ao final de cada contribuinte.

        PJ p2= new PJ();
        p2.setNome("Contribuinte 02");
        p2.setCnpj("23.894.877/0001-79");
        p2.setRendaBruta(5000);


        PF p3 = new PF();
        p3.setNome("Contribuinte 03");
        p3.setCpf("489.982.740-78");
        p3.setRendaBruta(4000);


        PJ p4= new PJ();
        p4.setNome("Contribuinte 04");
        p4.setCnpj("70.803.982/0001-35");
        p4.setRendaBruta(10000);


        PF p5 = new PF();
        p5.setNome("Contribuinte 05");
        p5.setCpf("383.671.420-55");
        p5.setRendaBruta(1800);


        PJ p6= new PJ();
        p6.setNome("Contribuinte 06");
        p6.setCnpj("84.079.667/0001-11");
        p6.setRendaBruta(6000);


        Contribuinte[] contribuintes = new Contribuinte[6];
        contribuintes[0]=p1;
        contribuintes[1]=p2;
        contribuintes[2]=p3;
        contribuintes[3]=p4;
        contribuintes[4]=p5;
        contribuintes[5]=p6;

        for(Contribuinte c: contribuintes){
            System.out.println(c.toString());
        }

    }
}
