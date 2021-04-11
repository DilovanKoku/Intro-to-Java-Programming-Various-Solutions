import java.util.Scanner;

public class Chapter4Question24 {
    /*(Order three cities) Write a program that prompts the user to enter three cities
    and displays them in ascending order.*/
    public static void main(String[] args) {
        //Question 4.24
        Scanner input = new Scanner(System.in);

        //Create a temp variable for city placeholder
        String temp;

        //Prompt the user for 3 cities
        System.out.print("Enter the first city: ");
        String city1 = input.nextLine();
        System.out.print("Enter the second city: ");
        String city2 = input.nextLine();
        System.out.print("Enter the third city: ");
        String city3 = input.nextLine();

        if (city2.compareToIgnoreCase(city1) < 0 && city2.compareToIgnoreCase(city3) < 0){
            temp = city1;
            city1 = city2;
            city2 = temp;
        }
        else if (city3.compareToIgnoreCase(city1) < 0 && city3.compareToIgnoreCase(city2) < 0){
            temp = city1;
            city1 = city3;
            city3 = temp;
        }
        if (city3.compareToIgnoreCase(city2) < 0){
            temp = city3;
            city3 = city2;
            city2 = temp;
        }
        System.out.println("The cities in alphabetical order are " + city1 + ", " + city2 + ", " + city3);

    }
}
