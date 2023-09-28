package week_3_methods;

import java.util.Arrays;

public class CorporateSponsors {
    public static void main(String[] args) {
        String[] sponsors = {"ikea", "at&t", "cvs", "3m"};

//        for (int x = 0; x < sponsors.length; x++) {
//            // System.out.println(sponsors[x]);
//            String sponsor = sponsors[x];
//            sponsor = sponsor.toUpperCase();
//            sponsors[x] = sponsor;
//        }

        for (int x = 0; x < sponsors.length; x++) {
            sponsors[x] = sponsors[x].toUpperCase();
        }

        System.out.println(Arrays.toString(sponsors));
    }
}
