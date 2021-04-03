import java.util.Scanner;

public class Chapter3Question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Prompt user for weight
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        //Prompt user for height feet and inches
        System.out.print("Enter feet: ");
        double feet = input.nextDouble();
        System.out.print("Enter inches: ");
        double inches = input.nextDouble();
        //Conversions
        double poundToKg = weight * 0.454;
        double feetToMeters = feet * 0.3048;
        double inchToMeters = inches * 0.0254;
        double finalHeight = feetToMeters + inchToMeters;
        //BMI
        double BMI = (poundToKg)/Math.pow(finalHeight,2);
        //Display results
        System.out.println("Your BMI is " + BMI);
        if (BMI < 18.5) {
            System.out.println("Underweight");
        }
        else if (BMI < 25) {
            System.out.println("Normal");
        }
        else if (BMI < 30) {
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obese");
        }




    }
}
