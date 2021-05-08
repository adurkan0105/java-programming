package day10_shorthand_operators;

public class ShortHnadOperators {
    public static void main(String[] args) {
        int cars = 10;
        System.out.println("cars in the parking lot = " + cars);
        cars= cars+2;
        System.out.println("cars = " + cars);
        cars+=5;
        System.out.println("cars = " + cars);
        //6 cars left the parking lot
        cars=cars-6;
        //cars-= 6;
        System.out.println("cars = " + cars);

        cars=cars-1;
        cars-=1;
        System.out.println("cars in the parking lot = " + cars);

        int electricCars=13;
        cars= cars+ electricCars;
        System.out.println("cars in parking lot = " + cars);

        String word = "Java";
        System.out.println("word = " + word);

        word= word + " programming";
        System.out.println("word = " + word);
        //add " is fun"
        word+= " is fun ";
        System.out.println(word);
        String selenium= " but \"selenium\" is more fun.  ";
        word+=selenium;
        System.out.println("selenium = " + selenium);
        System.out.println("word = " + word);

        word+=12345;
        System.out.println("word = " + word);

        char letter = 'A';
        System.out.println("letter = " + letter);
        letter += 3;
        System.out.println("letter = " + letter);
        //add 1 to letter
        letter +=1;
        System.out.println("letter = " + letter);


        double parkingFee= 7.50;
        System.out.println("normal parking fee = " + parkingFee);
        //early bird fee is 50 off
        parkingFee/=2;
        System.out.println("Early bird parking fee  = " + parkingFee);
       // weekend parking fee
        parkingFee-= parkingFee;
        System.out.println("Weekend parking fee = " + parkingFee);
        // count++; add one to variable
        int i = 44;
        i++;
        System.out.println("i = " + i);

    /*
        num=num+1;
        num += 1;
        num++;
        ++num;
        all of those statements above are adding 1 to the value of num.
  */

    }
}
