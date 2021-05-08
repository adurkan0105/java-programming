package day23_string_manipulation;



public class ChaininStringMethods {
    public static void main(String[] args) {
        String word="Woo den sp oon";

        System.out.println(word.toUpperCase().toLowerCase().length());
        System.out.println(word.toUpperCase().replace(" ", ""));

        String city="ISTANBUL";
        System.out.println(city.substring(0,1).toUpperCase()+city.substring(1).toLowerCase());

        String capitalized=city.substring(0,1).toUpperCase()+ city.substring(1).toLowerCase();
        System.out.println("capitalized = " + capitalized);

//str.toUpperCase().toLowerCase().equals("something")

        int i=1;
        if(i<=5){
            System.out.println(i); }

    }
}
