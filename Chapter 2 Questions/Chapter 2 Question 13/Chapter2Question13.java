import java.util.Scanner;

public class Chapter2Question13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the monthly saving amount: ");
        double monthlySavings = input.nextDouble();
        double monthlyRate = 0.00417;
        double firstMonthSavings = (monthlySavings * (1 + monthlyRate));
        double secondMonthSavings = (firstMonthSavings * (1 + monthlyRate)) ;
        double thirdMonthSavings = (secondMonthSavings * (1 + monthlyRate)) ;
        double fourthMonthSavings = (thirdMonthSavings * (1 + monthlyRate)) ;
        double fifthMonthSavings = (fourthMonthSavings * (1 + monthlyRate)) ;
        double sixthMonthSavings = (fifthMonthSavings * (1 + monthlyRate)) ;
        double totalSavingsInSixMonths = (firstMonthSavings + secondMonthSavings + thirdMonthSavings + fourthMonthSavings + fifthMonthSavings + sixthMonthSavings);
        System.out.println("After the sixth month, the account balance value is " + totalSavingsInSixMonths);

    }
}
