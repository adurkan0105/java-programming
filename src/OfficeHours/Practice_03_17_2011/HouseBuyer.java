package OfficeHours.Practice_03_17_2011;
/*

You are buying a new house and need to collect information about the houses in a specific area. You will give the neighborhood name and see the average house price, rating of school districts near by(out of 5), if it is a gated community or not, allow pets or not.

Make variables for all of that information. Given empty defaults for all except the neighborhood name. Print the information once at the end.

    Data based on neighborhood name:

        name - Hills
        average price - 89,000
        rating - 4.0
        gated - no
        allow pets - yes

        name - Oaks
        average price - 75,000
        rating - 3.5
        gated - no
        allow pets - yes

        name - Highland
        average price - 150,000
        rating - 4.5
        gated - yes
        allow pets - no

        name - Canyon
        average price - 201,000
        rating - 4.8
        gated - yes
        allow pets - yes
 */
public class HouseBuyer {
    public static void main(String[] args) {
    String name="Caynon";
    double price, rating;
    boolean gated,allowspets;
    switch ("name"){
        case "Hills" :
            price=89000;
            rating=4.0;
            gated=true;
            allowspets=true;
            break;

        case "Oak":
            price=75000;
            rating=3.5;
            gated=false;
            allowspets=true;
            break;
        case "Highland":
            price=150201;
            rating=4.5;
            gated=true;
            allowspets=false;
            break;
        case "Canyon":
            price=201000;
            rating=4.8;
            gated=true;
            allowspets=true;
            break;
        default:
            price=0;
            rating=0;
            gated=false;
            allowspets=false;


    }
        System.out.println("name = " + name);
        System.out.println("price = " + price);
        System.out.println("rating = " + rating);
        System.out.println("gated = " + gated);
        System.out.println("allowspets = " + allowspets);
    }
}
