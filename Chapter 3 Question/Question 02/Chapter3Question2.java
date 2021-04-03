import java.util.Scanner;

public class Chapter3Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Generate 3 random digits
        int digit1 = (int)(Math.random() * 10);
        int digit2 = (int)(Math.random() * 10);
        int digit3 = (int)(Math.random() * 10);
        int sum = digit1 + digit2 + digit3;
        System.out.println("What is the sum of " + digit1 + " + " + digit2 + " + " + digit3 + "?");
        int answer = input.nextInt();
        //Check answer
        if (answer == sum){
            System.out.println("Correct!, the answer is " + sum );
        }else{
            System.out.println("Sorry, the correct answer is " + sum);
        }

    }
}
