import java.util.Scanner;

public class Chapter4Question21 {
    public static void main(String[] args) {
        //Question 4.21 Check SSN
        Scanner input = new Scanner(System.in);

        //Prompt the user for a SSN
        System.out.print("Enter a SSN: ");
        String SSN = input.nextLine();

        //Check to see if the input is valid
        boolean isValid = Character.isDigit(SSN.charAt(0)) && Character.isDigit(SSN.charAt(1)) && Character.isDigit(SSN.charAt(2)) && SSN.charAt(3) == '-' && Character.isDigit(SSN.charAt(4)) && Character.isDigit(SSN.charAt(5)) && SSN.charAt(6) == '-' && Character.isDigit(SSN.charAt(7)) && Character.isDigit(SSN.charAt(8)) && Character.isDigit(SSN.charAt(9)) && Character.isDigit(SSN.charAt(10));

        //Use ternary operator to check (Note: this can also be done using an if statement)
        System.out.println(SSN + " is " + (isValid ? "a valid" : "an invalid") + " social security number");
    }
}

