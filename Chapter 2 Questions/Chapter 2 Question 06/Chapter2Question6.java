import java.util.Scanner;

public class Chapter2Question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();
        int lastDigit = number % 10;
        number = number / 10;
        int middleDigit = number % 10;
        number = number /10;
        int firstDigit = number % 10;
        int sumOfDigits = firstDigit + middleDigit + lastDigit;
        System.out.println("The sum of the digits is " + sumOfDigits);


    }
}
