import java.util.Scanner;

public class Chapter4Question9 {
    public static void main(String[] args) {
        //Question 4.9 Find the Unicode of a character
        Scanner input = new Scanner(System.in);

        //Ask the user for a character
        System.out.print("Enter a character: ");
        String userInput = input.nextLine();
        char unicode = userInput.charAt(0);

        //Display result
        System.out.println("The Unicode for the character " + userInput + " is " + (int)unicode);
    }
}
