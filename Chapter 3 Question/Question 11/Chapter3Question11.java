import java.util.Scanner;

public class Chapter3Question11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Ask user for month
        System.out.println("Enter month (1 - 12): ");
        int month = input.nextInt();
        //Ask user for year
        System.out.println("Enter current year: ");
        int year = input.nextInt();

        //boolean for leap year
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        //Switch statement to check for month and leap year
        switch (month){
            case 1 -> System.out.println("January " + year + " has 31 days");
            case 2 -> System.out.println("February " + year + (isLeapYear ? " has 29 days" : " has 28 days"));
            case 3 -> System.out.println("March " + year + " has 31 days");
            case 4 -> System.out.println("April " + year + " has 30 days");
            case 5 -> System.out.println("May " + year + " has 30 days");
            case 6 -> System.out.println("June " + year + " has 31 days");
            case 7 -> System.out.println("July " + year + " has 30 days");
            case 8 -> System.out.println("August " + year + " has 31 days");
            case 9 -> System.out.println("September " + year + " has 30 days");
            case 10 -> System.out.println("October " + year + " has 31 days");
            case 11 -> System.out.println("November " + year + " has 30 days");
            case 12 -> System.out.println("December " + year + " has 31 days");
            }

        }
    }

