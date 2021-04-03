import java.util.Scanner;

public class Chapter3Question12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //prompt user to enter integer
        System.out.println("Enter a three-digit integer:  ");
        int integer = input.nextInt();

        //Obtain the first, middle and last digits
        int lastDigit = integer % 10; // last digit
        int middleDigit = integer / 10; // first two digits
        int secondDigit = middleDigit % 10; // middle digit
        int firstDigit = middleDigit/ 10; //first digit

        //check is palindrome
        if (firstDigit == lastDigit){
            System.out.println(integer + " is a palindrome");
        }
        else {
            System.out.println(integer + " is not a palindrome");
        }



    }
}
