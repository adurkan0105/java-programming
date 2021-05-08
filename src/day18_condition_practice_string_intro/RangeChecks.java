package day18_condition_practice_string_intro;
import java.util.Scanner;
public class RangeChecks {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a score: ");
    int score= scan.nextInt();
    if(score>=1 && score<=40){
            System.out.println("Score is D ");
        } else if(score>=41 && score<=60){
            System.out.println("Score is C ");}
    else if(score>=61 && score<=90){
        System.out.println("Score is B ");}

    else if(score>=91 && score<=100){
        System.out.println("Score is A ");}

  else {
        System.out.println("invalid score");

        }
    }    }

