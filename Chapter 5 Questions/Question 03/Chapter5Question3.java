public class Chapter5Question3 {
    public static void main(String[] args) {
        /*
        Question 5.3
        (Conversion from kilograms to pounds)
        Write a program that displays the following table (note 1 kilogram is 2.2 pounds):
        Kilograms        Pounds
        1                 2.2
        3                 6.6
       ...
       197               433.4
       199               437.8
         */


        System.out.println("Kilograms      Pounds");
        //for loop for odd number
        for (int i = 1; i < 200; i = i +2) {
            System.out.printf("%-15d%6.1f" + "\n", i, i * 2.2);
        }


    }
}
