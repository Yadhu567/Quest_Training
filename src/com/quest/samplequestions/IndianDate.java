package com.quest.samplequestions;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class IndianDate {
    public static void main(String[] args) {
        LocalDateTime localDate=LocalDateTime.now();
        DateTimeFormatter dateFormatter=DateTimeFormatter.ofPattern("dd:MM:yyyy");
        String indianDate=localDate.format(dateFormatter);
        System.out.println("indian date is "+ indianDate);
    }
}
