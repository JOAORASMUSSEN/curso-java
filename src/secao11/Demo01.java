package secao11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Demo01 {
    public static void main(String[] args) {
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();//horario do lcoal
        Instant d03 = Instant.now(); //horario de Londres

        LocalDate d04 = LocalDate.parse("2026-10-05");
        LocalDateTime d05 = LocalDateTime.parse("2026-10-05T10:00:20");
        Instant d06 = Instant.parse("2026-10-05T10:00:20Z");
        Instant d07 = Instant.parse("2026-10-05T10:01:20-03:00");//horario de SP - 03:00 = equivalente em Londres

        LocalDate d08 = LocalDate.parse("05/10/2026", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("05/10/2026 10:30", fmt2);

        LocalDate d10 = LocalDate.of(2026, 10, 5);
        LocalDateTime d11 = LocalDateTime.of(2026, 10, 5, 10, 31, 24);

        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);
        System.out.println(d04);
        System.out.println(d05);
        System.out.println(d06);
        System.out.println(d07);
        System.out.println(d08);
        System.out.println(d09);
        System.out.println(d10);
        System.out.println(d11);
    }
}
