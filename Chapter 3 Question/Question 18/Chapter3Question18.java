import java.util.Scanner;

public class Chapter3Question18 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Prompt user for input
        System.out.println("Enter the weight of your package (1 - 20lbs) to get a price: ");
        int weightOfPackage = input.nextInt();

        //Conditions
        if (weightOfPackage <= 0 ){
            System.out.println("Invalid input");
        }
        else if (weightOfPackage > 20){
            System.out.println("The package cannot be shipped, it exceeds the 20 lb limit");
        }
        else if (weightOfPackage <= 1){
            System.out.println("The cost of shipping your package is $3.50");
        }
        else if (weightOfPackage <= 3){
            System.out.println("The cost of shipping your package is $5.50");
        }
        else if (weightOfPackage <= 10){
            System.out.println("The cost of shipping your package is $8.50");
        }
        else {
            System.out.println("The cost of shipping your package is $10.50");
        }
    }
}
