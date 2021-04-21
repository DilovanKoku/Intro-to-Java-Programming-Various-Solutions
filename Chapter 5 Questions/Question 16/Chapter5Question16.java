import java.util.Scanner;

public class Chapter5Question16 {
    public static void main(String[] args) {
        /* Question 5.16
        (Find the factors of an integer) Write a program that reads an integer and displays
        all its smallest factors in an increasing order.
        For example, if the input integer is 120, the output should be as follows: 2, 2, 2, 3, 5.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to find all factors: ");
        int userInput = input.nextInt();
        int denominator = 2;

          while (userInput / denominator != 1){
            if ( userInput % denominator == 0){
                System.out.print(denominator + ",");
                userInput = userInput / denominator;
            }
            else{
                denominator ++;
            }
        }
        System.out.print(userInput + " ");

        
    }
}
