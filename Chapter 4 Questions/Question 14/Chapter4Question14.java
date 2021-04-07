import java.util.Scanner;

public class Chapter4Question14 {
    public static void main(String[] args) {
        //Question 4.14 Letter Grade to Number
        Scanner input = new Scanner(System.in);

        //Ask the user for letter grade
        System.out.println("Enter a letter grade: ");
        String letterGrade = input.nextLine().toUpperCase();
        char charLetter = letterGrade.charAt(0);

        //We can use .isletter and switch

        if(Character.isLetter(charLetter)){

            switch (charLetter){
                case 'A' -> System.out.println("The numeric value for grade A is 4");
                case 'B' -> System.out.println("The numeric value for grade B is 3");
                case 'C' -> System.out.println("The numeric value for grade C is 2");
                case 'D' -> System.out.println("The numeric value for grade D is 1");
                case 'F' -> System.out.println("The numeric value for grade F is 0");
                default -> System.out.println(letterGrade + " is an invalid grade");
            }
        }
        else{
            System.out.println(letterGrade + " is an invalid grade!");
        }

    }
}
