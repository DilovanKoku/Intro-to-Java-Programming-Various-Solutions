import java.util.Scanner;

public class Chapter3Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Prompt user for a, b, c
        System.out.println("Enter a , b , c to solve for the roots: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        //define the discriminant and quadratic equation for roots
        double discriminant = Math.pow(b * b - (4 * a * c), 0.5);
        double r1 = (-b + discriminant)/ (2 * a);
        double r2 = (-b - discriminant)/ (2 * a);
        //Check for roots
        if (discriminant > 0){
            System.out.println("The equation has two root: " + r1 + " and " + r2);
        }
        else if (discriminant == 0){
            System.out.println("The equation has one root " + r1);
        }
        else{
            System.out.println("The equation has no real roots");
        }
    }
}
