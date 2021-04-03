import java.util.Scanner;

public class Chapter3Question14 {
    public static void main(String[] args) {
        int headsOrTails = (int)(Math.random() * 2);

        //Ask user for choice
        Scanner input = new Scanner(System.in);
        System.out.println("heads or tails?(0 for heads, 1 for tails): ");
        int userChoice = input.nextInt();

        //Check
        if (headsOrTails == 1 && userChoice == 1){
            System.out.println("Correct!, the answer was Tails");
        }
        else{
            System.out.println("Sorry, the correct answer was heads");
        }

        // using ternary operator
        System.out.println((userChoice == headsOrTails ? "correct" : " incorrect") + " guess");



    }
}
