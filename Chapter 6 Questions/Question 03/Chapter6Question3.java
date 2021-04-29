import java.util.Scanner;

public class Chapter6Question3 {
    // Question 6.3
    /*
    (Palindrome integer) Write the methods with the following headers:
    Return the reversal of an integer, e.g., reverse(456) returns 654
    public static int reverse(int number)

    Return true if number is a palindrome
    public static boolean isPalindrome(int number)
    Use the reverse method to implement isPalindrome.
    A number is a palindrome if its reversal is the same as itself.
    Write a test program that prompts the user to enter an integer and reports whether the integer is a palindrome.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to determine if it is a palindrome: ");
        int userInput = input.nextInt();
        System.out.println(userInput + (isPalindrome(userInput) ? " is": " is not") + " a palindrome.");

    }

    /** method to reverse number*/
    public static int reverse(int number){
        String reverseNumber = "";
        String numberAsString = number + "";

        for (int i = numberAsString.length() - 1; i >= 0; i--){
            reverseNumber = reverseNumber + numberAsString.charAt(i);
        }
        return Integer.parseInt(reverseNumber);
    }
    /** boolean for palindrome */
    public static boolean isPalindrome(int number){
        return number == reverse(number);

    }




}
