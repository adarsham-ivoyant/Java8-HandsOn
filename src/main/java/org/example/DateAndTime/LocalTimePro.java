package org.example.DateAndTime;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class LocalTimePro {
    public static void main(String[] args) throws InterruptedException {
        LocalTime now = LocalTime.now();
        System.out.println(now);

        LocalTime cust = LocalTime.of(14,26);
        System.out.println(cust);

        LocalTime parsed = LocalTime.parse("15:30:45");
        System.out.println(parsed);

        LocalTime beforeOnehour = now.minusHours(1);
        System.out.println(beforeOnehour);

        if(now.isAfter(beforeOnehour)){
            System.out.println("Yes");
        }

        //Localdate and Time

        LocalDateTime now1 = LocalDateTime.now();
        System.out.println(now1);

        //Zoned date
        ZonedDateTime now2 = ZonedDateTime.now();
        System.out.println(now2);

        //Instant
        Instant inst = Instant.now();
        System.out.println(inst);

        //Duration
        LocalTime a = LocalTime.now();
        Thread.sleep(2000);

        LocalTime b= LocalTime.now();

        Duration dur = Duration.between(a,b);

        System.out.println(dur);

        //Period
        LocalDate now4 = LocalDate.now();
        LocalDate then = LocalDate.of(2000,1,10);
        Period period = Period.between(now4,then);
        System.out.println(period);

        //DateTimeFormatter
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String format = localDate.format(myFormatter);
        System.out.println(format);


    }
}
