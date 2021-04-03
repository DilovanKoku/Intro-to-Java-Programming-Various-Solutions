import java.util.Scanner;

public class Chapter3Question25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Ask user for inputs
        System.out.print("Enter x1, y1, x2 , y2, x3, y3, x4, y4: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        //define variables for Cramer's rule ax + by = e and cx + dy = f

        double a = (y1 - y2);
        double b = -(x1 - x2);
        double e = (y1 - y2)* x1 - (x1 - x2) * y1;
        double c = (y3 - y4);
        double d = -(x3 - x4);
        double f = (y3 - y4) * x3 - (x3 - x4) * y3;
        double denominator = ((a * d) - (b * c)); // Denominator for Cramer's rule
        //Computing the values
        double x = ((e * d) - (b * f))/denominator;
        double y = ((a * f) - (e * c))/denominator;

        //If no solution, the lines are parallel
        if (denominator == 0){
            System.out.println("The two line are parallel");
        }
        else {
            System.out.println("The intersecting point is (" + x + "," + y + ")" );
        }





    }
}
