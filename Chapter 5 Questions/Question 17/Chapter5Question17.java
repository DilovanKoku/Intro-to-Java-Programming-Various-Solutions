import java.util.Scanner;

public class Chapter5Question17 {
    public static void main(String[] args) {
        /* Question 5.17
        (Display pyramid) Write a program that prompts the user to enter an integer from 1 to 15
        and displays a pyramid, as presented in the following sample run:
         */

        Scanner input = new Scanner(System.in);

        //Ask the user for input
        System.out.print("Enter the number of lines: ");
        int lines = input.nextInt();

        for (int rows = 1; rows <= lines; rows++){
            for (int whiteSpace = (lines - rows); whiteSpace >= 1; whiteSpace --){
                System.out.print("  ");
            }
            for (int leftTriangle = rows; leftTriangle >= 1; leftTriangle --){
                System.out.print(leftTriangle + " ");
            }
            for (int rightTriangle = 2; rightTriangle <= rows; rightTriangle ++){
                System.out.print(rightTriangle + " ");
            }
            System.out.println();
        }



    }
}
