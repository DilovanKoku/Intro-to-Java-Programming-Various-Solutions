import java.util.Scanner;

public class Chapter5Question1 {
    public static void main(String[] args) {
          /*Question 5.1
        (Count positive and negative numbers and compute the average of numbers)
        Write a program that reads an unspecified number of integers,
        determines how many positive and negative values have been read,
        and computes the total and average of the input values
        (not counting zeros). Your program ends with the input 0. Display the average as a floating-point number
         */

        Scanner input = new Scanner(System.in);
        int negativeCounter = 0;
        int positiveCounter = 0;
        double total = 0;
        int counter = 0;


        //Prompt the user for information
        System.out.print("Enter an integer, the input ends if it is 0: ");
        int integers = input.nextInt();


        if (integers == 0){
            System.out.println("No numbers are entered except 0");
            System.exit(1);
        }

        //use a while loop to check conditions
        while (integers != 0){
            if (integers > 0){
                positiveCounter++;
            }
            else {
                negativeCounter++;
            }
            total = total + integers;
            counter ++;
            integers = input.nextInt();
        }
        //Display results


        System.out.println("The number of positives is " + positiveCounter);
        System.out.println("The number of negatives is " + negativeCounter);
        System.out.println("The total is " + total);
        System.out.printf("The average is %1.2f", (total/counter));

    }
}
