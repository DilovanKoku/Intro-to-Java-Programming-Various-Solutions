import java.util.Scanner;

public class Chapter2Question23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the driving distance: ");
        double distance = input.nextDouble();
        System.out.println("Enter miles per gallon: ");
        double milePerGallon = input.nextDouble();
        System.out.println("Enter price per gallon: ");
        double pricePerGallon = input.nextDouble();
        double costOfTrip = (distance/milePerGallon) * pricePerGallon;
        System.out.println("The cost of driving is $" + (int) (costOfTrip * 100) /100.0 );

    }
}
