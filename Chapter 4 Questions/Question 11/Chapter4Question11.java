import java.util.Scanner;

public class Chapter4Question11 {
    public static void main(String[] args) {
        //Question 4.11 Decimal to hex
        Scanner input = new Scanner(System.in);

        //Ask the user for decimal value
        System.out.print("Enter a decimal value (0 - 15): ");
        int userInput = input.nextInt();

        //Check answer
        if (userInput >= 0 && userInput <=9){
            System.out.println("The hex value is " + userInput);
        }
        else if (userInput >= 10 && userInput <= 15){
            System.out.println("The hex value is " + (char)(userInput + 'A' - 10));
        }
        else{
            System.out.println(userInput + " is an invalid input");
        }

    }
}
