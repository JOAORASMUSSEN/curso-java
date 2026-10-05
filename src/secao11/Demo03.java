package secao11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Demo03 {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.parse("2026-10-05");
        LocalDateTime d02 = LocalDateTime.parse("2026-10-05T10:33:36");
        Instant d03 = Instant.parse("2026-10-05T01:33:36Z");

        LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
        LocalDate r3 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
        LocalDate r4 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);

        System.out.println("d01 dia = "+ d01.getDayOfMonth());
        System.out.println("d01 mês = "+ d01.getMonthValue());
        System.out.println("d01 ano = "+ d01.getYear());

        System.out.println("d02 hora = "+d02.getHour());
        System.out.println("d02 minutos = "+d02.getMinute());
        System.out.println("d02 segundos = "+d02.getSecond());
    }
}
