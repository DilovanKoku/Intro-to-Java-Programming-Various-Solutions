import java.util.Scanner;

public class Chapter5Question8 {
    public static void main(String[] args) {
        /* Question 5.8
        (Find the highest score) Write a program that prompts the user to enter the
        num-ber of students and each student’s name and score, and finally displays
        the name of the student with the highest score.
        Use the next() method in the Scanner class to read a name,
        rather than using the nextLine() method. Assume that the number of students is at least 1.
         */
        Scanner input = new Scanner(System.in);
        String namePlaceholder = "";
        int scorePlaceholder = 0;

        //Ask the user for number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudent = input.nextInt();

        //Use a for loop to iterate for entered number of students
        for (int i = 1; i <= numberOfStudent; i++){
            //Placeholders for score and name


            //Ask for name and score
            System.out.print("Enter student " + (i) + " name: ");
            String name = input.next();


            System.out.print("Enter the student's score: ");
            int score = input.nextInt();


            //Check condition
            if (score > scorePlaceholder){
                namePlaceholder = name;
                scorePlaceholder = score;
            }

        }
        System.out.println(namePlaceholder + " has the highest score.");

    }
}
