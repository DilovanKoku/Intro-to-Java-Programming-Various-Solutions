import java.util.Scanner;

public class Chapter2Question12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter velocity (m/s) and acceleration(m/s^2): ");
        double velocity = input.nextDouble();
        double acceleration = input.nextDouble();
        double length = (Math.pow(velocity,2)/(2 * acceleration));
        System.out.println("The minimum runway length for this airplane is " + (int)(length*100)/100.0);



    }
}
