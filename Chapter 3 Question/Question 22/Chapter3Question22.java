import java.util.Scanner;

public class Chapter3Question22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompt user for two coordinates (x1, y1)
        System.out.println("To determine if two points are in a circle of center (0,0),");
        System.out.print("enter a point with two coordinates: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        //Formula for distance
        double distance = Math.pow(Math.pow(x2 - 0,2) + Math.pow(y2-0,2), 0.5);

        //Check conditions
        if (distance > 10){
            System.out.println("Point (" + x2 + ", " + y2 + ") is not in the circle");
        }
        else{
            System.out.println("Point (" + x2 + ", " + y2 + ") is in the circle");
        }


    }
}
