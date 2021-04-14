import java.util.Scanner;

public class Chapter5Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /* Question 5.2
        (Repeat additions) Listing 5.4, SubtractionQuizLoop.java,
        generates five random subtraction questions.
        Revise the program to generate 10 random addition questions for two integers between 1 and 15.
        Display the correct count and test time.
         */

        //initialize the start time
        double startTime = System.currentTimeMillis();

        //Generate 2 random numbers


        //Initialize correct count
        int correctCount = 0;
        String output = "";

        //We can use a for loop
        for (int i = 0; i < 10; i++){

            //Generate 2 random numbers between 1 and 15
            int random1 = 1 + (int)(Math.random() * 16 - 1);
            int random2 = 1 +(int)(Math.random() * 16 - 1);

            //Prompt the user for answer
            System.out.print("What is " + random1 + " + " + random2 + "?: ");
            int userAnswer = input.nextInt();
            output += "\n" + random1 + " + " + random2 + " = " + userAnswer + (random1 + random2 == userAnswer ? " correct" : " incorrect");

            //check if answer is correct
            if (random1 + random2 == userAnswer){
                System.out.println("Correct!");
                correctCount++;

            }
            else {
                System.out.println("Sorry, the correct answer is " + (random1 + random2));
            }


        }
        // display the results
        double endTime = System.currentTimeMillis();
        double totalTime = (endTime - startTime) / 1000;
        System.out.println("\nYou had " + correctCount + " correct answers");
        System.out.printf("You answered the questions in %1.2f" + " seconds", totalTime);
        System.out.println("\n" + output);

    }
}
