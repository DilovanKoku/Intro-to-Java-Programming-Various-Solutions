import java.util.Scanner;

public class Chapter5Question9 {
    public static void main(String[] args) {
        /* Question 5.9
        (Find the two highest scores) Write a program that prompts the user to enter the
        number of students and each student’s name and score,
        and finally displays the student with the highest score and
        the student with the second-highest score.
        Use the next() method in the Scanner class to read a name rather than using the nextLine() method.
        Assume that the number of students is at least 2.
         */

        Scanner input = new Scanner(System.in);

        //Create place holder variables
        int firstPlace = 0;
        int secondPlace = 0;
        String name;
        String student1 = "";
        String student2 = "";

        //Ask user for number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        //Use a for loop for the range
        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.print("Enter the students name: ");
            name = input.next();

            System.out.print("Enter the students score: ");
            int score = input.nextInt();

            if (i == 1){
                student1 = name;
                firstPlace = score;
            }
            if (i == 2){
                student2 = name;
                if (score > firstPlace){
                    secondPlace = firstPlace;
                    firstPlace = score;
                    name = student1;
                    student1 = student2;
                    student2 = name;
                }
            }
            if (i > 2){
                if (score > firstPlace && score > secondPlace){
                    firstPlace = score;
                    student2 = student1;
                    student1 = name;
                }
            }

        }
        System.out.println("Highest score is " + student1 + "\n" + "Second highest is " + student2);


        // Note: I used nested for loops to solve this problem. There are other ways of solving it as well.



    }


    }

