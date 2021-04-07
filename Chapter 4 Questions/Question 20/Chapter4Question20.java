import java.util.Scanner;

public class Chapter4Question20 {
    public static void main(String[] args) {
        //Question 4.20 Process a String
        Scanner input = new Scanner(System.in);

        //Ask user for information
        System.out.print("Please enter a string: ");
        String userInput = input.nextLine();
        System.out.println("The first character of the string is: " + userInput.charAt(0) + ", and the string length is: " + userInput.length());
    }
}
