package day19_class_vs_object_strings;

public class StringComparison {
    public static void main(String[] args) {
        String city="Chicago";
        //EQUALS() method-CASE SENSITIVE
        System.out.println(city.equals("Chicago")); //true
        System.out.println(city.equals("chicago")); //false
        System.out.println(city.equals("chicago "));//false
        System.out.println(city.equalsIgnoreCase("Chicago"));//true
        System.out.println(city.equalsIgnoreCase("chicago"));//true
        System.out.println(city.equalsIgnoreCase("Chicago "));//false

        if(city.equals("CHICAGO")) {
            System.out.println("equals() true");
        }else
        {
            System.out.println("equals() false");

        }

    }
}
