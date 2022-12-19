package edu.aula85a100;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

public class Aula93 {
    public static void main(String[] args) {
        //data dd MM yyyy
        LocalDate agora = LocalDate.now();
        System.out.println(agora);

        System.out.println(LocalDate.of(2022, 12, 25));
        System.out.println(LocalDate.parse("2022-12-25"));//precisa estar no formato YYYY-mm-dd


        System.out.println(agora.plusDays(30));//acrescentar

        System.out.println(agora.minus(1, ChronoUnit.MONTHS));//diminuir

        System.out.println(agora.getDayOfWeek());
        System.out.println(agora.getDayOfMonth());
        System.out.println(agora.getDayOfYear());

        System.out.println(LocalDate.parse("2020-02-01").isLeapYear());

        // hora formato ISO
        LocalTime hAgora = LocalTime.now();
        System.out.println(hAgora);

        System.out.println(LocalTime.of(20, 18));
        System.out.println(LocalTime.parse("20:18"));//precisa estar no formato ISO

        System.out.println(hAgora.plusMinutes(50));//adicionar
        System.out.println(hAgora.minus(40, ChronoUnit.MINUTES));//diminuir

        System.out.println(hAgora.getHour());

        // data completa = data + hora
        LocalDateTime agoraCompleto = LocalDateTime.now();
        System.out.println(agoraCompleto);

        System.out.println(LocalDateTime.of(2023, 2, 16, 20, 25, 10));
        System.out.println(LocalDateTime.parse("2022-12-17T14:51:10"));//precisa estar no padrão ISO
        System.out.println(agoraCompleto.plusYears(20));

        ZoneId fuso = ZoneId.systemDefault();
        System.out.println(fuso);

        Set<String> fusos = ZoneId.getAvailableZoneIds();
		/*for (String f : fusos) {
			System.out.println(f);
		}*/

        ZoneId ny = ZoneId.of("America/New_York");
        ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.parse("2022-12-17T14:51:10"), ny);
        System.out.println(zdt);
        System.out.println(ZonedDateTime.parse("2022-12-17T14:51:10-05:00[America/New_York]"));

        ZoneOffset offset = ZoneOffset.of("+02:00");
        OffsetDateTime offsetdt = OffsetDateTime.of(agoraCompleto, offset);
        System.out.println(offsetdt);
        System.out.println("--------------");

        /*Date date = new Date();
        Calendar c = Calendar.getInstance();
        LocalDateTime ldtDate = LocalDateTime.ofInstant(date.toInstant(), ny);
        System.out.println(ldtDate);
        System.out.println(LocalDateTime.ofInstant(c.toInstant(), ny));*/

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(fmt.format(agoraCompleto));
        LocalDateTime localDateTimeNy = LocalDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(fmt.format(localDateTimeNy));
    }
}


