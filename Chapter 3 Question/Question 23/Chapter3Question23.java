import java.util.Scanner;

public class Chapter3Question23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompt user for coordinates
        System.out.println("To check if a point is within a rectangle centered at (0,0) with width 10 and height 5,");
        System.out.print("enter a point with two coordinates: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double horizontalDistance = Math.pow(Math.pow(x1-0,2),0.5);
        double verticalDistance = Math.pow(Math.pow(y1-0,2),0.5);

        //Check conditions
        if (horizontalDistance <= 10.0/2.0 && verticalDistance <= 5.0/2.0){
            System.out.println("Point (" + x1 + ", " + y1 + ") is in the rectangle");
        }
        else {
            System.out.println("Point (" + x1 + ", " + y1 + ") is not the rectangle");
        }

    }
}
