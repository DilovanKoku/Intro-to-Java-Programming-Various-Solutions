public class Chapter5Question4 {
    public static void main(String[] args) {
        /* Question 5.4
        (Conversion from miles to kilometers)
        Write a program that displays the following table (note 1 mile is 1.609 kilometers):

       Miles         Kilometers
       1             1.609
       2             3.218
       ...
       9             14.481
       10            16.090
         */

        System.out.println("Miles     Kilometers");

        //We can use a for loop
        for (int i = 1; i <= 10; i++){
            System.out.printf("%-10d%-6.3f" + "\n", i , i * 1.609);
        }
    }
}
