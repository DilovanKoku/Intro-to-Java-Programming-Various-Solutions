import java.util.Scanner;

public class Chapter3Question8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Ask for integers
        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int number2 = input.nextInt();
        System.out.print("Enter third integer: ");
        int number3 = input.nextInt();

        int tempValue = 0;
        //Order number from lest to greatest
        if (number1 > number2 || number1 > number3) {
            if (number1 > number2){
                tempValue = number1;
                number1 = number2;
                number2 = tempValue;
            }
            if (number1 > number3){
                tempValue = number1;
                number1 = number3;
                number3 = tempValue;
            }
        }
        if (number2 > number3){
            tempValue = number2;
            number2 = number3;
            number3 = tempValue;
        }
        System.out.println(number1 + " , " + number2 + " , " + number3);
    }
}
