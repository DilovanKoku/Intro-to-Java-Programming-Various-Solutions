import java.util.Scanner;

public class Chapter4Question2 {
    public static void main(String[] args) {
        //Question 4.2 Great Circle Distance
        Scanner input = new Scanner(System.in);
        double radius = 6371.01; //Earth's radius

        //Ask the user for point 1 and point 2
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        //Conversion from degrees to radians
        double x1ToRAd = Math.toRadians(x1);
        double y1ToRad = Math.toRadians(y1);
        double x2ToRad = Math.toRadians(x2);
        double y2ToRad = Math.toRadians(y2);

        //great circle distance formula
        double d = radius * Math.acos((Math.sin(x1ToRAd) * Math.sin(x2ToRad)) + (Math.cos(x1ToRAd) * Math.cos(x2ToRad) * Math.cos(y1ToRad - y2ToRad)));

        //Display solution
        System.out.println("The distance between the two points is " + d + " km");

    }
}
