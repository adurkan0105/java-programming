package day06_arithmetic_operators;

public class MoreMathOperators {
    public static void main(String[] args){
        int toyotas= 431;
        int hondas= 233;
        int vws= 2;
        int tesla = 20;
        int bmws = 155;

        int totalCarsInTheParkingLot;
        totalCarsInTheParkingLot=toyotas+hondas+vws+tesla+bmws;

        System.out.println("There are "+ totalCarsInTheParkingLot +" cars in the parking lot");

        String pizza="hawaiann";
        int slices= 8;
        int people= 4 ;
        int slicesPerPerson= slices/ people ;
        System.out.println("there are"+ slicesPerPerson + "slices per person");
        System.out.println("We ordered " + pizza +  "pizza with "   + slices + " slices, "+ people + " people ate "+ slicesPerPerson+ " slices per person");



    }

}
