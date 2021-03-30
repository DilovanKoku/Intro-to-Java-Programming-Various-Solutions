import java.util.Scanner;

public class Chapter2Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble();
        double feetToMeters = (feet * 0.305);
        System.out.println(feet + " feet is " + feetToMeters + " meters");
    }
}
