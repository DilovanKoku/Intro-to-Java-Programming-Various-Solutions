public class Chapter4Question25 {
    /*(Generate vehicle plate numbers) Assume that a vehicle plate number consists of three
    uppercase letters followed by four digits. Write a program to generate a plate number.
     */
    public static void main(String[] args) {
        //Question 4.25

        //we can generate random letters from A to Z using ASCII A = 65 and Z = 90 (Capital letters)
        int randomLetter1 = 65 + (int)(Math.random() * (90 - 65));
        int randomLetter2 = 65 + (int)(Math.random() * (90 - 65));
        int randomLetter3 = 65 + (int)(Math.random() * (90 - 65));

        //generate random numbers
        int randomNumber1 = (int)(Math.random() * 10);
        int randomNumber2 = (int)(Math.random() * 10);
        int randomNumber3 = (int)(Math.random() * 10);
        int randomNumber4 = (int)(Math.random() * 10);

        //Display results
        System.out.println("The randomly generated license plate number is " + (char)(randomLetter1) + (char)(randomLetter2) + (char)(randomLetter3) + "-" + randomNumber1 + randomNumber2 + randomNumber3 + randomNumber4);




    }
}
