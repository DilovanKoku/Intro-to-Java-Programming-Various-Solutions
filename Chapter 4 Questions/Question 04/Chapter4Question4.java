import java.util.Scanner;

public class Chapter4Question4 {
    public static void main(String[] args) {
        //Question 4.4 Area of Hexagon
        Scanner input = new Scanner(System.in);

        //Prompt user for information
        System.out.print("Enter the side: ");
        double s = input.nextDouble();

        //Get the area of hexagon
        double area = (6 * Math.pow(s,2)) / (4 * Math.tan(Math.PI / 6));

        //Display answer
        System.out.printf("The area of the hexagon is %1.2f",area);




    }
}
