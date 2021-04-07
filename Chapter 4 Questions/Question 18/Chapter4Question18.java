import java.util.Scanner;

public class Chapter4Question18 {
    public static void main(String[] args) {
        //Question 4.18 Student major and status
        Scanner input = new Scanner(System.in);

        //Prompt the user for information
        System.out.print("Enter two characters: " );
        String userInput = input.next().toUpperCase();
        char firstChar = userInput.charAt(0);
        char secondChar = userInput.charAt(1);


        //Use the switch statement twice to obtain the major, then the year
        switch (firstChar) {
            case 'M' -> System.out.print("Mathematics ");
            case 'C' -> System.out.print("Computer Science ");
            case 'I' -> System.out.print("Information Technology ");
            default -> {
                System.out.print("Invalid input");
                System.exit(1);
            }
        }

        switch (secondChar){
            case '1' -> System.out.println("Freshman");
            case '2' -> System.out.println("Sophomore");
            case '3' -> System.out.println("Junior");
            case '4' -> System.out.println("Senior");
            default -> System.out.println("Invalid input");

        }



    }
}
