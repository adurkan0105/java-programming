package day09_scanner_practice;
import java.util.Scanner;

public class SalaryCalculator {
    public static void main (String[] args) {
       System.out.println("Enter hourly rate: ");
        double hourlyRate = 55.0;
        double weeklyPay= hourlyRate *40 ;
        double monthlyPay = weeklyPay*52/12;
        double annualPay = monthlyPay * 12 ;

        System.out.println("weekley pay: "+ weeklyPay);
        System.out.println("monthlyPay = " + monthlyPay);
        System.out.println("annualPay = " + annualPay);




    }




}








