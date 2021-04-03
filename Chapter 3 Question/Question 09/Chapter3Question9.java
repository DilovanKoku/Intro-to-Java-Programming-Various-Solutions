import java.util.Scanner;

public class Chapter3Question9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Asking user for ISBN number
        System.out.println("Enter the first 9 digits of an ISBN as an integer: ");
        int ISBN = input.nextInt();

        //Using modulo operator
        int d1 = (ISBN / 100000000);
        int modulo = ISBN % 100000000;
        int d2 = modulo / 10000000;
        modulo = modulo % 10000000;
        int d3 = (modulo / 1000000);
        modulo = modulo % 1000000;
        int d4 = (modulo / 100000);
        modulo = modulo % 100000;
        int d5 = (modulo / 10000);
        modulo = modulo % 10000;
        int d6 = (modulo / 1000);
        modulo = modulo % 1000;
        int d7 = (modulo / 100);
        modulo = modulo % 100;
        int d8 = (modulo / 10);
        modulo = modulo % 10;
        int d9 = modulo;

        //Check sum
        int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;


        //Checking conditions
        if (d10 == 10){
            System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 +d6 + d7 + d8 + d9 + "X");
        }
        else{
            System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9);
        }



    }
}
