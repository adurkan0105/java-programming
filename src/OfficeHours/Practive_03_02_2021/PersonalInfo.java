package OfficeHours.Practive_03_02_2021;

public class PersonalInfo {
    public static void main(String[] args) {


    String name, fullBirthDate , favoriteQuote;
    byte age;
    char gender;
    boolean student;
    short numberOfSiblings;
    long favoriteNumber;
    int numberOfSeasons, year;
    double birthDate;


    // assingment of data
        name="Ali Durkan";
        age=32;
        gender='M';
        student=true;
        numberOfSiblings=3;
        favoriteNumber=986L;
        birthDate=3.2;
        year=2021;
        fullBirthDate=birthDate+ year+""; // 2025.2 -> adds first then turns to String
            fullBirthDate=""+ birthDate+ "."+ year; // 3.2.2021
       String favotireQuote="hava a good mindset";
        System.out.println(fullBirthDate);
        double a= birthDate + '.' + year;
        System.out.println(fullBirthDate);


        System.out.println("Name:"+ name);
        System.out.println("Age: " + age);
        System.out.println("Full birthdate: " + fullBirthDate);









    }

}
