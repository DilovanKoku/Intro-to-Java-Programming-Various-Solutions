import java.util.Scanner;

public class Chapter2Question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal: ");
        double total = input.nextDouble();
        System.out.print("Enter the gratuity rate: ");
        double gratuity = input.nextDouble()/100 * total;
        double totalWithGratuity = (total + gratuity);
        System.out.println("The gratuity is $" + gratuity + " and the total is $" + totalWithGratuity);

    }
}
