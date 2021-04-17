public class Chapter5Question13 {
    public static void main(String[] args) {
        /* Question 5.13
        (Find the largest n such that n3 < 12,000)
        Use a while loop to find the largest integer n such that n3 is less than 12,000.
         */

        int n = 0;

        while (Math.pow(n + 1,3) < 12000){
            n ++;
        }
        System.out.println("The largest integer n such that n^3 < 12000 is " + n);

        /* Note: if we didn't add the plus one, the answer would have been 23. We add it because once it
        reaches 22 (which is the answer), it adds 1 to it, and this make n bigger than 12,000. Therefore,
        at 22, it exits the loop.

         */



    }
}
