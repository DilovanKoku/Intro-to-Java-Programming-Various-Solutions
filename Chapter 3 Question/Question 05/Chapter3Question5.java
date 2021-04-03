import java.util.Scanner;

public class Chapter3Question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Prompt user for day
        System.out.print("Enter today's day: ");
        int today = input.nextInt();
        //Prompt user for future day
        System.out.print("Enter the number of days elapsed since today: ");
        int daysElapsed = input.nextInt();
        int futureDay = (today + daysElapsed) % 7; // the reason why we use modulo 7 is because once a week has gone by, it starts again at 0 (Sunday)
        //Switch statement for today
        System.out.println("Today is:");
        switch (today){
            case 0 -> System.out.println("Sunday");
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            default -> System.out.println("Sorry, enter a number from 0 - 6");
        }
        //Switch for future day
        System.out.println("and the future day is:");
        switch (futureDay){
            case 0 -> System.out.println("Sunday");
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            default -> System.out.println("Sorry, enter a number from 0 - 6");
        }



    }
}
