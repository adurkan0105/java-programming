package OfficeHours.Practice_03_24_2021;

import java.util.Locale;

public class CharIndex {
    public static void main(String[] args) {
        /*




         */


        String s = "java";
        //  System.out.println(s.charAt(s.length()));
        System.out.println(s.charAt(s.length() - 1));

        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(3));
        System.out.println(s.charAt(0) + s.charAt(3));

        String upper = s.toUpperCase();
        System.out.println(upper);

        upper = "" + s.toUpperCase().charAt(0) + s.toUpperCase().charAt(3);
        System.out.println(upper);

    }
}
