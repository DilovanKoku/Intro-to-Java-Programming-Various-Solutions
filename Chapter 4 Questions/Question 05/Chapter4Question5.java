import java.util.Scanner;

public class Chapter4Question5 {
    public static void main(String[] args) {
        // Question 4.5 Area of a regular polygon
        Scanner input = new Scanner(System.in);

        //Ask the user for sides and length of side
        System.out.print("Enter the number of sides: ");
        int n = input.nextInt();
        System.out.print("Enter the side length: ");
        double s = input.nextDouble();

        //Compute area
        double area = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));

        //Display result
        System.out.println("The area of the polygon is " + area);

    }
}
