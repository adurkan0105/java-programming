package Day16_switch_ternary;

public class ApartmentLease {
    public static void main(String[] args) {
        System.out.println("####Welcome to ADAIRE APARTMENS ######");
        int numberOfBedrooms = 2;
        double startingPrice = 0;
        switch (numberOfBedrooms) {
            default:
                System.out.println(numberOfBedrooms + " bedroom currently unavailable ");
                break;
            case 0:

                System.out.println("Studio apartment selected ");
                startingPrice = 1454.0;
                break;
            case 1:
                System.out.println("One bedroom apartment selected ");
                startingPrice = 1725;

            case 2:
                System.out.println("Two beroom aparment selected ");
                startingPrice = 2899;
                break;


        }
        System.out.println("Starting price : $ "+ startingPrice);


    }
}
