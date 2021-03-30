import java.util.Scanner;

public class Chapter2Question14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight in pounds: ");
        double weight = input.nextDouble();
        System.out.println("Enter your height in inches: ");
        double height = input.nextDouble();
        double massInKg = weight * 0.45359237;
        double heightInMeters = height * 0.0254;
        double BMI = (massInKg)/(Math.pow(heightInMeters,2));
        System.out.println("BMI is : " + (int) (BMI * 100)/100.0);
    }
}
