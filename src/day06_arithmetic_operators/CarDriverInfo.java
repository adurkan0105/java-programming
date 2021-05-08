package day06_arithmetic_operators;

public class CarDriverInfo {
    public static void main(String[] args){
// carModel>>>String
        //driverName>> String
        //LicenseNum >> String
        //speed>> short
        String carModel="BMW X5";
        String driverName="Donald Trump";
        String licenceDum= "Letsmakejava Great Again123456";
        short speed=55 ;
        boolean isAutomatic=true;
        char licenseClasss= 'D';


        System.out.println("Car Model is "+carModel+"\nCar Driver Name"+driverName);
        System.out.println("Licence number"+licenceDum);
        System.out.println(speed+"is speed.");
        System.out.println("This car is "+isAutomatic);
        System.out.println("Driver licence class is "+licenseClasss);
        System.out.println(driverName+"is driving "+ carModel);
        System.out.println("Current speed is : " + speed);

        System.out.println("is car automatic ->" +  isAutomatic);
        System.out.println(licenseClasss+ " -- " + isAutomatic);
//+,will not work with all data types
        // GOOD :
        //-> When 1 or both are String:
        // int n=10;
        // System.out.println("this is " +) ;
        //System.out.println(n+ " is ten ");
        // String city= "Baltimore";
        // int  population=120000;
        //System.out.println(city+population);
        System.out.println(10 + 5 );








    }
}
