import java.util.Scanner;

public class Chapter3Question21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* Zeller's Algorithm

        h = ( q + 26(m + 1)/10 + k + k/4 + j/4 + 5j) % 7
        h = day of the week
        q = day of the month
        m = month ( January = 12 and February = 14)
        j = year / 100;
        k = year of the century

        */


        //Ask user for inputs
        System.out.print("Enter year: (e.g., 2012): ");
        int year = input.nextInt();
        System.out.print("Enter month: 1-12: ");
        int month = input.nextInt();
        System.out.print("Enter the day of the month: 1-31: ");
        int dayOfMonth = input.nextInt();

        if (month == 1){
            month = 13;
            year = year - 1;

        }
        if (month == 2){
            month = 14;
            year = year -1;
        }


        // We can also define q , m , j , and k below (this can also be done above, however, I want to show it here for ease of understanding)

        int q = dayOfMonth;
        int m = month;
        int j = year / 100;
        int k = year % 100;

        // Define the Zeller's Algorithm
        int h = ( q + (26 * (m + 1))/(10) + k + (k/4) + (j/4) + 5*j) % 7;

        switch (h){
            case 0 -> System.out.println("Day of the week is Saturday");
            case 1 -> System.out.println("Day of the week is Sunday");
            case 2 -> System.out.println("Day of the week is Monday");
            case 3 -> System.out.println("Day of the week is Tuesday");
            case 4 -> System.out.println("Day of the week is Wednesday");
            case 5 -> System.out.println("Day of the week is Thursday");
            case 6 -> System.out.println("Day of the week is Friday");

        }

    }
}
