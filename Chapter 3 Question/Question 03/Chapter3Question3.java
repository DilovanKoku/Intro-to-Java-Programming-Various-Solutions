import java.util.Scanner;

public class Chapter3Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Prompt the user for a, b, c, d, e, f
        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        //Solve equation using Cramer's rule
        if (a * d - b * c == 0)
            System.out.println("The equation has no solution.");
        else
        {
            double x = (e * d - b * f) / (a * d - b * c);
            double y = (a * f - e * c) / (a * d - b * c);
            System.out.println("x is " + x + " and y is " + y);
        }
    }
}
