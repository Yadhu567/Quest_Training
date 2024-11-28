package com.quest.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeClass {
    public static void main(String[] args) {
        LocalDateTime localDateTime=LocalDateTime.now();

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyy hh:mm:ss");
        String formattedDateTime=localDateTime.format(formatter);
        System.out.println(formattedDateTime);
    }

}
