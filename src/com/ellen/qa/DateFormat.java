package com.ellen.qa;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateFormat {
    public static void main(String[] args) {
        Date date = new Date();
        String format = new String("yyyy--MM-dd HH:mm:ss");
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        System.out.println(sdf.format(date));

        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");//´úÌæsimpleDateFormat

    }
}
