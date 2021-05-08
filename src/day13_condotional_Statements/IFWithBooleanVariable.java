package day13_condotional_Statements;

public class IFWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = false;


        if (isHungry) {
            System.out.println("I am hungry I will go get something to eat ");
            System.out.println("Then code Java");
        }
        // if(isHungry)
        else {
            System.out.println("I am not hungry,  I will keep coding java ! ");

        }


        double price = 130.44;
        boolean isAffordable = price <= 200.0;
        System.out.println("isAffordable = " + isAffordable);
        if (isAffordable) {
            System.out.println("I can afford it, lets buy !");

        } else {
            System.out.println("Too expensive, lets keep coding java");
        }


        System.out.println("I can afford it, lets buy! ");

        boolean isRemoteJob = true;
//if it not remotejob print "Sorry I am not interested "
        if (!isRemoteJob) {
            System.out.println("Sure I am interested, what is the interview process ? ");
        } else {
            System.out.println("Sorry I am not interested ");

        }
        String city="Fairfax";
        if(city == "Fairfax") {
            System.out.println("It is Fairfax");

        }




    }
}

