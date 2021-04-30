import java.util.Scanner;

public class Chapter6Question4 {
    //Question 6.4
    /*
    (Display an integer reversed) Write a method with the following header to display an integer in reverse order:
    public static void reverse(int number)
    For example, reverse(3456) displays 6543.
    Write a test program that prompts the user to enter an integer then displays its reversal.

     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to get the reverse: ");
        int userInput = input.nextInt();
       reverse(userInput);
    }

    public static void reverse(int number){
        String reverse = "";
        String numberAsString = number + "";

        for (int i = numberAsString.length() - 1; i >= 0; i--){
            reverse = reverse + numberAsString.charAt(i);
        }
        System.out.println(reverse);

    }



}
