package day07_arithmetic_operators_casting;

public class StringConcat {
    public static void main(String[] args){
        System.out.println("Java " + 5 + 3 ); // java53
        System.out.println("Java " + (5+3)); // java 8
        System.out.println(5+3 +" java");
int num1=7;
int num2=8;
System.out.println(num1+num2); // 15
System.out.println(num1 + "" + num2); // 7 8
System.out.println(num1+""+num2);//78
        /* operator precedence
      order of operations *, / calculated first ., +, - calculated after if you have them in same line
*/



    }
}
