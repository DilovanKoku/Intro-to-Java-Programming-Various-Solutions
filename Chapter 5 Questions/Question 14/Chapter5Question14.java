import java.util.Scanner;

public class Chapter5Question14 {
    public static void main(String[] args) {
        /* Question 5.14
        (Compute the greatest common divisor) Another solution for Listing 5.9 to find the greatest
        common divisor of two integers n1 and n2 is as follows:
        First find d to be the minimum of n1 and n2,
        then check whether d, d–1, d–2, ..., 2, or 1 is a divisor for both n1 and n2 in this order.
        The first such common divisor is the greatest common divisor for n1 and n2.
        Write a program that prompts the user to enter two positive integers and displays the gcd.

         */

        Scanner input = new Scanner(System.in);


        System.out.print("Enter the first integer: ");
        int n1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int n2 = input.nextInt();

        if (n2 < n1) {
            int temp = n2;
            n2 = n1;
            n1 = temp;
        }

        for (int i = n1; i <= n2; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                System.out.println("The gcd is " + i);
                break;
            }
        }

    }
}
