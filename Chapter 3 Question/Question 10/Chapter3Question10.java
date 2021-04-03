import java.util.Scanner;

public class Chapter3Question10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Boiler plate code
        int randomNumber1 = (int) (Math.random() * 100);
        int randomNumber2 = (int) (Math.random() * 100);
        int answer = randomNumber1 + randomNumber2;

        //Ask user for answer
        System.out.print("What is " + randomNumber1 + " + " +  randomNumber2 + "?: ");
        int userInput = input.nextInt();

        //Check
        if (userInput == answer){
            System.out.println("Correct! the answer is " + answer);
        }
        else{
            System.out.println("Sorry, the correct answer was " + answer);
        }


    }
}
