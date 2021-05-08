package day13_condotional_Statements;

public class ATMPincodeProgram {
    public static void main(String[] args) {
        System.out.println("***********************WELCOME TO TD BANK ATM*****************");
        int secretPincode = 2233;
        int inputPinCode = 2283;
        if (inputPinCode == secretPincode) {
            System.out.println("Welcome to your account ");
            System.out.println("You can withdraw, check your balance, deposit ");
        } else {
            System.out.println("Incorrect pincode! " + inputPinCode);
        }
        System.out.println("Thank you for using TD Bank ATM! ");
    }
}
