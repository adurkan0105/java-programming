package day20_string_manipulation;

public class StringContains {
    public static void main(String[] args) {
        String company="Capital one";
        System.out.println(company.contains("i"));
        System.out.println(company.contains("ital"));
        System.out.println(company.contains("one"));


        if (company.contains(" "))
        {
            System.out.println("multiple words compnay name ");
        }else {
            System.out.println("single word company name ");
        }
        String etsyTitle= "Wooden spoon | Etsy ";
        if(etsyTitle.contains("|")){
            System.out.println("Pass - title check passed ");
        }else {
            System.out.println("Fail- title check failed ");
        }

        String firstName="ahmet";
        //check if firstName contains a
        if(firstName.contains("h")&& firstName.contains("e")){
            System.out.println("both h and e are present ");
        } else
        {
            System.out.println("h || e not present");
        }
        firstName="Nadir";
        if(firstName.contains("a")||firstName.contains("i"))
        {
            System.out.println("a and i available ");
        }
            String email= "murodil@cybertekschool.com";
        //check if email contains "@ and ends with com
        if(email.endsWith("com")){
            System.out.println("email contains .com at the end ");
        }
        String sentence= " java strings are fun ";
        System.out.println(sentence);
        System.out.println(sentence.replace("a", "b"));
        System.out.println(sentence.replace("a", "W"));
        System.out.println(sentence.replace("strings", "conditions"));

    }

}
