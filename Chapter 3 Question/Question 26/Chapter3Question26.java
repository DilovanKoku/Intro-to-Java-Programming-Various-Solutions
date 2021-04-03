import java.util.Scanner;

public class Chapter3Question26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Promp the user for a number
        System.out.print("Enter an integer: ");
        int userInput = input.nextInt();

        //Check the conditions (Can also use ternary operator)

        boolean andOperator = userInput % 5 == 0 && userInput % 6 ==0;
        boolean orOperator = userInput % 5 == 0 || userInput % 6 ==0;
        boolean XOR_Operator = userInput % 5 == 0 ^ userInput % 6 ==0;

        System.out.println("Is " + userInput + " divisible by 5 and 6? " + andOperator);
        System.out.println("Is " + userInput + " divisible by 5 or 6? " + orOperator);
        System.out.println("Is " + userInput + " divisible by 5 or 6, but not both? " + XOR_Operator);






    }
}
