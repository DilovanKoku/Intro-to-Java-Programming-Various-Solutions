import java.util.Scanner;

public class Chapter2Question7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of minutes: ");
        int minutes = input.nextInt();
        int numberOfYears = minutes/525600;
        int remainingDays = (minutes % 525600)/1440;
        System.out.println(minutes + " minutes is approximately " + numberOfYears + " years and " + remainingDays + " days");
    }
}
