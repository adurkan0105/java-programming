package day14_multi_branch_if_statement;

public class DayActivity {
    public static void main(String[] args) {
        String weather = "sunny";
        if (weather.equals("sunny")) {
            System.out.println(weather + " - Go to park, hiking, code java ");
        } else if (weather.equals("rainy")) {
            System.out.println(weather + " - stay home, drink tea, and code java ");
        } else if (weather.equals("snowy")) {
            System.out.println(weather + " - clean the car then build snowman, drink hot chocolate");
        } else if (weather.equals("windy")) {
            System.out.println(weather + " - Get ready for power loss , fly a kite, and code java ");
        }
    }
}
