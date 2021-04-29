import java.util.Scanner;

public class Chapter6Question2 {
    // Question 6.2
    /*
    (Sum the digits in an integer) Write a method that computes the sum of the digits in an integer.
    Use the following method header:
    public static int sumDigits(long n)
    For example, sumDigits(234) returns 9 (= 2 + 3 + 4).
    (Hint: Use the % operator to extract digits and the / operator to remove the extracted digit.
    For instance, to extract 4 from 234, use 234 % 10 (= 4). To remove 4 from 234, use 234 / 10 (= 23).
    Use a loop to repeatedly extract and remove the digit until all the digits are extracted.
    Write a test program that prompts the user to enter an integer then displays the sum of all its digits.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer to determine the sum: ");
        long userInput = input.nextLong();
        System.out.println("The sum of " + userInput + " is " + sumDigits(userInput));

    }

    /** Method for extracting digits */
    public static long sumDigits(long n){
        long sum = 0;

        while (n > 0){
            sum = sum + (n % 10);
            n = n / 10;
        }
        return sum;

    }
}
