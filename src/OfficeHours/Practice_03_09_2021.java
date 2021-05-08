package OfficeHours;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Practice_03_09_2021 {
    public static void main(String[] args) {
        int inputSeconds, hours, minutes, seconds;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter seconds");
        inputSeconds= scan.nextInt();

        hours=inputSeconds/3600; // 3695/3600= 1
      //  inputSeconds%3600; remainder
        inputSeconds = inputSeconds%3600 ; // 95
        inputSeconds%=3600;
        minutes=inputSeconds / 60;
        inputSeconds%=60; // 35
        seconds= inputSeconds;

        System.out.println(hours + " hours " + minutes + " minutes " +seconds+  " seconds ");


    }
}
