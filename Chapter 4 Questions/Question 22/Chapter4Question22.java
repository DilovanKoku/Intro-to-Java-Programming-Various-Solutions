import java.util.Scanner;

public class Chapter4Question22 {
    public static void main(String[] args) {
        //Question 4.22 Check substrings
        Scanner input = new Scanner(System.in);

        //Ask the user for strings
        System.out.print("Enter string s1: ");
        String s1 = input.nextLine();

        System.out.print("Enter string s2: ");
        String s2 = input.nextLine();

        //check with the .contains method
        if (s1.contains(s2)){
            System.out.println(s2 + " is a substring of " + s1);
        }
        else{
            System.out.println(s2 + " is not a substring of " + s1);
        }
    }
}
