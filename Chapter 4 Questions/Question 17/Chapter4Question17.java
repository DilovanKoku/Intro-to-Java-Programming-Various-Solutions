import java.util.Scanner;

public class Chapter4Question17 {
    public static void main(String[] args) {
        //Question 4.17 Days of Month

        Scanner input = new Scanner(System.in);

        //Ask the user for information
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.print("Enter a month (first 3 letters): ");
        String month = input.next();

        //Check if it is a leap year
        boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        //Use switch to check answers
        switch (month){
            case "Jan", "Mar", "May", "Jul", "Aug", "Oct", "Dec" -> System.out.println(month + " " + year + " has 31 days");
            case "Feb" -> System.out.println(month + " " + year + " has " + (leapYear ? 29 : 28) + " days");
            case "Apr", "Jun", "Sep","Nov" -> System.out.println(month + " " + year + " has 30 days");
            default -> System.out.println(month + " is not a correct month name, please capitalize the first letter");
        }







    }
}
