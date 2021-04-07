import java.util.Scanner;

public class Chapter4Question13 {
    public static void main(String[] args) {
        //Question 4.13 Vowel or Consonant?

        Scanner input = new Scanner(System.in);

        //Prompt user for letter
        System.out.print("Enter a letter: ");
        String letter = input.nextLine();


        //Get the char
        char letter1 = letter.charAt(0);


        //Use .isLetter and the switch statement to show if it is a vowel or consonant

        if (Character.isLetter(letter1)) {
            switch (letter1) {
                case 'A','a', 'I', 'i', 'E', 'e', 'O', 'o', 'U', 'u' -> System.out.println(letter1 + " is a vowel");
                default -> System.out.println(letter1 + " is a consonant");
            }
        }
        else{
            System.out.println(letter + " is an invalid input!");
        }







    }
}
