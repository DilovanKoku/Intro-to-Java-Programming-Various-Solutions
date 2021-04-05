import java.util.Scanner;

public class Chapter4Question6 {
    public static void main(String[] args) {
        // Question 4.6 Random points on a circle
        Scanner input = new Scanner(System.in);

        //Define the radius constant
        final int RADIUS = 40;

        //Generate the random points between 0 and 2PI
        double randomAngle1 = (Math.random() * 2 * Math.PI);
        double randomAngle2 = (Math.random() * 2 * Math.PI);
        double randomAngle3 = (Math.random() * 2 * Math.PI);

        //Get the points determined by angle
        double x1 = RADIUS * Math.cos(randomAngle1);
        double y1 = RADIUS * Math.sin(randomAngle1);

        double x2 = RADIUS * Math.cos(randomAngle2);
        double y2 = RADIUS * Math.sin(randomAngle2);

        double x3 = RADIUS * Math.cos(randomAngle3);
        double y3 = RADIUS * Math.sin(randomAngle3);

        //Get the 3 sides
        double a = Math.pow(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2), 0.5);
        double b = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);
        double c = Math.pow(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2), 0.5);

        //Calculate the 3 angles
        double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
        double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
        double C = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));

        //Display result
        System.out.printf("The three angles are: %1.2f %1.2f %1.2f", A ,B ,C);












    }
}
