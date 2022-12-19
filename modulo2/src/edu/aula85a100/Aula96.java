package edu.aula85a100;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

public class Aula96 {
    public static void main(String[] args) throws ParseException {

        // 1.000,00 - Brasil
        // 1,000.00 - EUA

        Locale en = new Locale("en", "United States");
        NumberFormat nf = NumberFormat.getInstance(en);
        String num = nf.format(100.99);
        System.out.println(num);

        Locale br = new Locale("pt", "Brazil");
        nf = NumberFormat.getInstance(br);
        num = nf.format(100.99);
        System.out.println(num);

        //MOEDA
        NumberFormat moeda = NumberFormat.getCurrencyInstance(Locale.getDefault());
        String valor = moeda.format(100.99);
        System.out.println(valor);

        Currency currency = moeda.getCurrency();
        System.out.println(currency);

        //PORCENTAGEM
        NumberFormat porcent = NumberFormat.getPercentInstance();//locale padrão
        String porcentagem = porcent.format(99.987);//9,999%
        System.out.println(porcentagem);

        porcent.setMaximumIntegerDigits(4);//casas inteiras
        porcent.setMinimumIntegerDigits(3);
        porcent.setMaximumFractionDigits(2);//casas decimais
        porcent.setMinimumFractionDigits(1);
        porcentagem = porcent.format(99.987);
        System.out.println(porcentagem);

        //ARREDONDAMENTO

        nf = NumberFormat.getInstance(Locale.getDefault());

        nf.setRoundingMode(RoundingMode.UP);
        nf.setMaximumFractionDigits(0);//precisa configurar as casas decimais para o arredontamento funcionar
        nf.setMinimumFractionDigits(0);
        System.out.println(nf.format(99.50));

        Number num3 = nf.parse("100,00");
        System.out.println(num3.intValue());
    }
}
