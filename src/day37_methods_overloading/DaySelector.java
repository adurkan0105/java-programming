package day37_methods_overloading;

public class DaySelector {
    public static void main(String[] args) {
        System.out.println(getDayName(1));
        System.out.println(getDayName(2));
        System.out.println(getDayName(10));
        for (int i = 1; i < 9; i++) {
            System.out.println(i + " = " + getDayName(i));
        }
    }

    public static String getDayName(int day) {
        switch (day) {
            case 1:
                return "Monday ";
            case 2:
                return "Tuesday ";
            case 3:
                return "Wednesday ";
            case 4:
                return "Thursday ";
            case 5:
                return "Friday ";
            case 6:
                return "Saturday ";
            case 7:
                return "Sunday";
            default:
                System.out.println("ERROR : Invalid day - " + day);
                return null;
        }


    }
}