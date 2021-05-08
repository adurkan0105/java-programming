package day18_condition_practice_string_intro;

public class AuthenticationTest {
    public static void main(String[] args) {
        int last4SSN=4444;
        int pinCode=4321;

        int expLast4SSN=1234;
        int expPinCode=4321;
        if( last4SSN == expLast4SSN && pinCode == expPinCode){
            System.out.println("Authentication succeessful");
        }else {
            System.out.println("Authentication unsucceessful");
            if(last4SSN !=expLast4SSN)
            {
                System.out.println("Last 4 SSN number is incorrect ");
            }else {
                System.out.println("Last 4 SSN number is incorrect ");
            }
            if(expPinCode!=pinCode){
                System.out.println("Pin Code is incorect");
            }
        }


    }
}
