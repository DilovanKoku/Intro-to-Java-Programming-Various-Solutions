import java.util.Scanner;

public class Chapter4Question8 {
    public static void main(String[] args) {
        //Question 4.8 Find the Character of an ASCII code
        Scanner input = new Scanner(System.in);

        //Ask user for the number
        System.out.println("Enter an ASCII code: ");
        int userInput = input.nextInt();

       //Get the answer
        System.out.println("The character for ASCII code " + userInput + " is " + (char)userInput);



    }
}
