public class Chapter5Question10 {
    public static void main(String[] args) {
        /* Question 5.10
        (Find numbers divisible by 5 and 6)
        Write a program that displays all the numbers from 100 to 1,000 (10 per line)
        that are divisible by 5 and 6. Numbers are separated by exactly one space.
         */

        int count = 0;
        final int LINE_LIMIT = 10;

        for (int i = 100; i <= 1000; i++){
                if (i % 5 == 0 && i % 6 == 0){
                    count ++;

                    if (count % LINE_LIMIT == 0){
                        System.out.println(i);

                    }
                    else {
                        System.out.print(i + " ");
                    }

            }

            }

        }
    }

