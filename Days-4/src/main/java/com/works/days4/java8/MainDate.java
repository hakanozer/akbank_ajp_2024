package com.works.days4.java8;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class MainDate {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println( date.getHours() );

        // LocalDateTime
        LocalDateTime now = LocalDateTime.now();
        System.out.println( now.getHour() );
        now.getDayOfMonth();
        now.getMonthValue();
        now.getYear();

        String pattern = "dd-MM-yyyy hh:mm:ss";
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        String stDate = dateFormat.format(date);
        System.out.println(stDate);
        System.out.println(date);

    }
}
