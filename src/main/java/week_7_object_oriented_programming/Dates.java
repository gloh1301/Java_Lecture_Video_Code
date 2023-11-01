package week_7_object_oriented_programming;

import java.util.Date;

public class Dates {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);

        // number of milliseconds since Midnight January 1st 1970 UTC
        System.out.println(now.getTime());

        long milliseconds = now.getTime();
        System.out.println(milliseconds);

        long numberOfMilliseconds = 1234567890L; // L at end for long int
        Date date2009 = new Date(numberOfMilliseconds);
        if (date2009.before(now)) {
            System.out.println("Date is before 2009");
        }


    }
}
