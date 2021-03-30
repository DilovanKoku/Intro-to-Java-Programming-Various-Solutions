import java.util.Scanner;

public class Chapter2Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius: ");
        double temp = input.nextDouble();
        double fahrenheit = (9.0/5.0 * temp + 32);
        System.out.println(temp + " degrees celsius is " + fahrenheit + " in degrees fahrenheit");



    }

}
