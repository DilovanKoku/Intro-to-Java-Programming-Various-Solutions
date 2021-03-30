import java.util.Scanner;

public class Chapter2Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder: ");
        double radius = input.nextDouble();
        System.out.print("Enter the length of the cylinder: ");
        double length = input.nextDouble();
        double area = Math.pow(radius,2) * Math.PI;
        double volume = area * length;
        System.out.println("The area is " + area);
        System.out.println("The volume is " +  volume);




    }
}
