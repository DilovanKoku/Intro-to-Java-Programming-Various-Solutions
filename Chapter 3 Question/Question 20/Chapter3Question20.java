import java.util.Scanner;

public class Chapter3Question20 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompt user for information
        System.out.print("Enter outside temperature (-58°F to 41°F) in degrees Fahrenheit: ");
        double outsideTemp = input.nextDouble();
        System.out.print("Enter wind speed (>=2) in miles/hour: ");
        double windSpeed = input.nextDouble();
        double windChillTemp = (35.74 + 0.6215 * outsideTemp - (35.75 * Math.pow(windSpeed,0.16)) + (0.4275 * outsideTemp * Math.pow(windSpeed,0.16)));

        //Check conditions
        if (outsideTemp < -59 || outsideTemp > 42){
            System.out.println("Please enter a valid temperature range (-58°F to 41°F)");
        }
        else if (windSpeed < 2){
            System.out.println("Please enter a valid wind speed");
        }
        else {
            System.out.println("The windchill temperature is " + windChillTemp + "°F" );

        }

    }
}
