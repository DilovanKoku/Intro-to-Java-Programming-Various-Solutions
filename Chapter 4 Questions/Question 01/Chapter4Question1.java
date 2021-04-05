import java.util.Scanner;

public class Chapter4Question1 {
    public static void main(String[] args) {
        //Area of a pentagon question (4.1)
        Scanner input = new Scanner(System.in);

        //Prompt the user for length
        System.out.print("Enter the length from the center to a vertex: ");
        double r = input.nextDouble();

        //Set up formulas
        double s = (2 * r * Math.sin(Math.PI/5));
        double area = (5 * Math.pow(s, 2) / (4 * Math.tan(Math.PI / 5)));

        //Display result
        System.out.printf("The area of the pentagon is %1.2f", area);



    }
}
