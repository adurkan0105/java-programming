package OfficeHours.Practice_03_08_2021;

import java.util.Scanner;

/*
Make a class Rectangle
create a main method

     - Declare two variables: length and width

         - Calculate the Perimeter 2(l+w)
         - Calculate the Area (w * l)

     - Print properties of the Rectangle

     - Modify to accept Scanner inputs
     //hard coded
     //dynamic with scanner
 */
public class Rectangle {
    public static void main(String[] args) {
     //   double length=5;
       // double width=3;
      Scanner input= new Scanner(System.in);

        System.out.println("Please enter lenght : ");
        double length = input.nextDouble();
        System.out.println("Please enter width : ");
        double width=input.nextDouble();
        double Perimeter= (length+width)*2;
        double area =length*width;
        System.out.println("perimeter = " + Perimeter );
        System.out.println("area = " + area);

    }
}
