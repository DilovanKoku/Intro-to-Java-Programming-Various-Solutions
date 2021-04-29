public class Chapter6Question1 {
    /* Question 6.1
    (Math: pentagonal numbers) A pentagonal number is defined as n(3n-1)/2 for n = 1, 2, ..., and so on.
    Therefore, the first few numbers are 1, 5, 12, 22, ..
    Write a method with the following header that returns a pentagonal number:
    public static int getPentagonalNumber(int n)
    For example, getPentagonalNumber(1) returns 1 and getPentagonalNumber(2) returns 5.
    Write a test program that uses this method to display the first 100 pentagonal numbers with 10 numbers on each line.
    Use the %7d format to display each number.
     */

    /** Main method*/
    public static void main(String[] args) {
        final int FIRST_100_PENTAGONALS = 100;
        final int NUMBER_OF_LINES = 10;
        int count = 0;

        System.out.println("The first 100 pentagonal numbers are");
        for (int i = 1; i <= FIRST_100_PENTAGONALS; i++) {
            System.out.printf("%7d", getPentagonalNumber(i));
            count++;
            if (count % NUMBER_OF_LINES == 0) {
                System.out.println();
            }
        }
    }

    /** Method for pentagonal formula */
    public static int getPentagonalNumber (int n){
        return (n * (3 * n - 1)) / 2;
    }
}
