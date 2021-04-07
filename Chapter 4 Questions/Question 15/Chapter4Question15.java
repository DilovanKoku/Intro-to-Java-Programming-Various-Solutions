import java.util.Scanner;

public class Chapter4Question15 {
    public static void main(String[] args) {
        //Question 4.15 Phone key pads
        Scanner input = new Scanner(System.in);

        //Ask the user for a letter
        System.out.println("Enter a letter: ");
        String letter = input.nextLine();
        char letterToChar = letter.charAt(0);
        letterToChar = Character.toUpperCase(letterToChar);


        //Use .isletter and switch statement
        if (Character.isLetter(letterToChar)){
            switch (letterToChar){
                case 'A','B','C' -> System.out.println("The corresponding number is 2");
                case 'D','E','F' -> System.out.println("The corresponding number is 3");
                case 'G','H','I' -> System.out.println("The corresponding number is 4");
                case 'J','K','L' -> System.out.println("The corresponding number is 5");
                case 'M','N','O' -> System.out.println("The corresponding number is 6");
                case 'P','Q','R','S' -> System.out.println("The corresponding number is 7");
                case 'T','U','V' -> System.out.println("The corresponding number is 8");
                case 'W','X','Y','Z' -> System.out.println("The corresponding number is 9");
                default -> System.out.println(letter + " is an invalid input");
            }
        }
        else{
            System.out.println(letter + " is and invalid input");
        }
    }
}
