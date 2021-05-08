package OfficeHours.Practice_03_23_2021;

public class SalaryCalculator {
    public static void main(String[] args) {
       int hourlyRate=10;
       int weeklyHours=40;
       int numberOfWeeks=52;
        boolean hourlyRateIsValid= hourlyRate>0;
        boolean weeklyHoursAreValid= weeklyHours> 0 && weeklyHours<=65;
        boolean numberOfWeeksAreValid= numberOfWeeks> 0;
    if(hourlyRateIsValid)
    {} else
        System.out.println("Hourly Rate cannot be Negative or Zero ");


    }

}
