import java.util.Scanner;

public class Chapter2Question1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //Ask the user for temperature
        System.out.println("Enter temperature in Celsius: ");
        double temp = input.nextDouble();
        
        //Coversion
        double fahrenheit = (9.0/5.0 * temp + 32);
        System.out.println(temp + " degrees celsius is " + fahrenheit + " in degrees fahrenheit");



    }

}
