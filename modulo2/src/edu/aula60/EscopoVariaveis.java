package edu.aula60;

public class EscopoVariaveis {
    private int valor;//atributo

    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    public int calcularValor(int valor){
        valor = valor + 10;// estou mencionando somente o parametro valor e não ao atributo
        //as variaveis valor estão de cor roxa e os parametros branco sublinhado, a IDE traz essa diferença.
        return valor;
    }

    public int teste(){
        int valor =5;
        if(true){
            valor--;
        }
        //this.valor = valor; //referencial valor global/atributo de classe
        return valor;
    }

    public void outroTeste(){
        for(int i=0; i<10; i++){
            System.out.println(i);
        }
        //i++; //erro de compilação, pois i foi declarado somente dentro do bloco for.

    }

    public void maisUmOutroTeste(int num){
        int total =0;
        try{
            int outroNum=0;//outroNum só existe dentro desse bloco try
            total=num/outroNum;
        }catch (Exception e){
            e.printStackTrace();//existe dentro do bloco catch
        }finally{
            total++;
        }//outroNum++; //erro de compilação
       //e.printStackTrace();//erro de compilação
    }


}
