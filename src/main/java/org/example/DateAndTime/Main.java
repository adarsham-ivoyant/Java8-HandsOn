package org.example.DateAndTime;

import java.time.LocalDate;
import java.time.Month;


public class Main {
    public static void main(String[] args) {

        //localDate
        LocalDate today=LocalDate.now();
        System.out.println(today);
        int year1 = today.getYear();
        System.out.println(year1);
        Month month = today.getMonth();
        System.out.println(month);
        int dayofmonth = today.getDayOfMonth();
        System.out.println(dayofmonth);

        //using today day i need to display yestreday date

        LocalDate yesterday = today.minusDays(1);
        System.out.println(yesterday);

        LocalDate backdate = today.minusDays(120);
        System.out.println(backdate);

        if(today.isAfter(yesterday)){
            System.out.println("yes");
        }

        //custome date
        LocalDate custome = LocalDate.of(2000,1,10);
        System.out.println(custome.getDayOfMonth());
        System.out.println(custome.getDayOfWeek());
    }
}
