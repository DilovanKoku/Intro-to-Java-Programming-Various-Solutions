public class Chapter5Question12 {
    public static void main(String[] args) {
        /* Question 5.12
        (Find the smallest n such that n^2 > 12,000) Use a while loop to
        find the smallest integer n such that n^2 is greater than 12,000.
         */

        // n will start at 0
        int n = 0;

        //It will keep incrementing until it is less than or equal to 12000.
        while (Math.pow(n,2) <= 12000){
            n++;
        }
        System.out.println("The smallest value n, such that n^2 > 12,000 is " + n);
        System.out.printf("because 110 squared is %1.0f", Math.pow(n,2));

    }
}
