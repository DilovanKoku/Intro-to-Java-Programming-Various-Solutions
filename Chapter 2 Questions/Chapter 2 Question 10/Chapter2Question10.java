import java.util.Scanner;

public class Chapter2Question10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of water in kg: ");
        double waterMass = input.nextDouble();
        System.out.println("Enter the initial temperature in Celsius:");
        double initialTemp = input.nextDouble();
        System.out.println("Enter the final temperature in Celsius: ");
        double finalTemp = input.nextDouble();
        double energy = ((waterMass * (finalTemp - initialTemp) * 4184));
        System.out.println("The energy needed is " + energy + " joules");
    }
}
