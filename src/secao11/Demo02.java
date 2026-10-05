package secao11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Demo02 {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.parse("2026-10-05");
        LocalDateTime d02 = LocalDateTime.parse("2026-10-05T10:33:36");
        Instant d03 = Instant.parse("2026-10-05T01:33:36Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;


        System.out.println(d01.format(fmt1));
        System.out.println(d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println(fmt1.format(d01));

        System.out.println(d02.format(fmt2));
        System.out.println(d02.format(fmt4));

        System.out.println(fmt3.format(d03));
        System.out.println(fmt5.format(d03));
    }
}
