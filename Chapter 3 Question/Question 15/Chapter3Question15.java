import java.util.Scanner;

public class Chapter3Question15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Generate random number
        int lotteryNumber = (int)(Math.random() * 1000);

        //check digits of lottery number
        int randomLastDigit = lotteryNumber % 10;
        int randomMiddleDigits = lotteryNumber / 10;
        int randomSecondDigit = lotteryNumber % 10;
        int randomFirstDigit = randomMiddleDigits / 10;


        //Prompt user for number
        System.out.println("Enter a three-digit integer: ");
        int userInput = input.nextInt();

        //check the digits
        int lastDigit = userInput % 10;
        int middleDigits = userInput / 10;
        int secondDigit = middleDigits % 10;
        int firstDigit = middleDigits / 10;

        //check lottery rules

        //Exact match
        if (userInput == lotteryNumber){
            System.out.println("Congratulations! you have won $10,000");
        }
        // all digits match the lottery number (Wording is confusing in the textbook) this is probably wrong
        else if (lastDigit == randomLastDigit && secondDigit == randomSecondDigit && firstDigit == randomFirstDigit){
            System.out.println("Congratulations! you have won $3000");
        }
        // one digit matches
        else if ((lastDigit == randomLastDigit) || (lastDigit == randomSecondDigit) || (lastDigit == randomFirstDigit) || (secondDigit == randomLastDigit) || (secondDigit == randomSecondDigit) || (secondDigit == randomFirstDigit) || (firstDigit == randomLastDigit) || (firstDigit == randomSecondDigit || (firstDigit == randomFirstDigit))){
            System.out.println("Congratulations! you have won $1000");
        }

        else {
            System.out.println("Sorry, you did not match!");
        }

        System.out.println("The exact numbers were: " + lotteryNumber);




    }
}
