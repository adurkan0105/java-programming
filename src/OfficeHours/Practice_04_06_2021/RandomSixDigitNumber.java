package OfficeHours.Practice_04_06_2021;

import java.util.Random;

public class RandomSixDigitNumber {
    public static void main(String[] args) {
        Random random= new Random();
        String randomNumber="";

        while(randomNumber.length()!=6){
            int eachRandom=random.nextInt();
            if(!randomNumber.contains(""+ eachRandom)){
                randomNumber+=eachRandom;
            }

        }


        System.out.println("Random Number: " + randomNumber);

    }
}
