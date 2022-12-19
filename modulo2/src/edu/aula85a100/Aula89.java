package edu.aula85a100;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Aula89 {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy hh:mm:ss a z");
        //z=>time zone - fuso horário
        //a => am ou pm

        Calendar data = new GregorianCalendar(2022, 11, 15, 17, 38, 25);

        System.out.println(sdf.format(data.getTime()));

        Date hoje = new Date();

        System.out.println(sdf.format(hoje));

        String d = sdf.format(hoje);

        System.out.println("-----------------------");

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        String minhaData = "20/02/2000";

        try {
            Date minhaDataEmDate = sdf1.parse(minhaData);

            System.out.println(minhaDataEmDate);

            System.out.println(sdf.format(minhaDataEmDate));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
