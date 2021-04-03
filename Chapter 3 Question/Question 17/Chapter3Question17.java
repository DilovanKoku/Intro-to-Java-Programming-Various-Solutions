import java.util.Scanner;

class Question3Problem17 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //boiler plate for rock , paper , scissor
        int randomNumber = (int)(Math.random() * 3); // generates a random number between 0 - 2
        String computer = "The computer is ";
        String user = " you are ";


        //switch statement for the random number
        switch (randomNumber){
            case 0 -> computer = computer + "scissor";
            case 1 -> computer = computer + "rock";
            case 2 -> computer = computer + "paper";
        }


        //Prompt user to enter choice
        System.out.println("Make your decision to see if you can beat the computer!");
        System.out.print("rock (1) , paper (2) , scissor (0): " );
        int userChoice = input.nextInt();

        //switch statement for user
        switch (userChoice){
            case 0 -> user = user + "scissor";
            case 1 -> user = user + "rock";
            case 2 -> user = user + "paper";
        }

        //check conditions
        if (userChoice == randomNumber){
            System.out.println(computer + user + " too. It is a draw");
        }
        else if (randomNumber == 0 && userChoice == 1){
            System.out.println(computer + user + " You won!");
        }
        else if (randomNumber == 1 && userChoice == 2){
            System.out.println(computer + user + " You won!");
        }
        else if (randomNumber == 2 && userChoice == 0){
            System.out.println(computer + user + " You won!");
        }
        else{
            System.out.println("Sorry, you lose " + computer + " and" + user);
        }







    }
}
