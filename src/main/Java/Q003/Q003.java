package main.Java.Q003;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q003 {

    public static void main(String[] args) {
        String date = LocalDate
                .parse("2024-10-08")
                .format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(date);
    }
}

/*
What is the result?
A. Oct 08, 2024T00:00:00.000
B. 2024-10-08T00:00: 00.000
C. 10/8/24T00:00:00.000
D. An exception is thrown at runtime.
*/
