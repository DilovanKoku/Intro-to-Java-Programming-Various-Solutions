public class Chapter5Question6 {
    public static void main(String[] args) {
        /* Question 5.6
        (Conversion from miles to kilometers)
        Write a program that displays the following two tables side by side:

        Miles            Kilometers   |    Kilometers       Miles
        1                1.609        |    20               12.430
        2                6.6          |    25               15.538
        ...
        9                14.481       |    60               37.290
        10               16.090       |    65               40.398

         */

        System.out.println("Miles    Kilometers     |    Kilometers    Miles");

        //use a for loop
        for (int i = 1, j = 20; i <=10 && j <=65; i++, j= j +5){
            System.out.printf("%-9d%-9.3f", i, i * 1.609);
            System.out.print("      |    ");
            System.out.printf("%-14d%-6.3f" + "\n", j, j/1.609);
        }



    }
}
