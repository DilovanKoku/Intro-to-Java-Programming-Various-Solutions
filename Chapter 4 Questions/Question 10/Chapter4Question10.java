import java.util.Scanner;

public class Chapter4Question10 {
    public static void main(String[] args) {
        //Question 4.10 Guess birthday
        Scanner input = new Scanner(System.in);

        String set1 = """
                 1  3  5  7
                 9 11 12 15
                17 19 21 23
                25 27 29 31
                """;
        String set2 = """
                 2  3  6  7
                10 11 14 15
                18 19 22 23
                26 27 30 31
                """;
        String set3 = """
                 4  5  6  7
                12 13 14 15
                20 21 22 23
                28 29 30 31
                """;
        String set4 = """
                 8 9 10 11
                12 12 14 15
                24 25 26 27
                28 29 30 31
                """;
        String set5 = """
                16 17 18 19
                20 21 22 23
                24 25 26 27
                28 29 30 31
                """;

        //placeholder
        int day = 0;

        //Ask user some questions
        System.out.println("Is you birthday in Set 1?\n");
        System.out.println(set1);
        System.out.print("\nEnter N for No and Y for Yes: ");
        String answer = input.nextLine();
        if (answer.equals("Y")){
            day = day + 1;
        }
        System.out.println("Is you birthday in Set 2?\n");
        System.out.println(set2);
        System.out.print("\nEnter N for No and Y for Yes: ");
        answer = input.nextLine();
        if (answer.equals("Y")){
            day = day + 2;
        }
        System.out.println("Is you birthday in Set 3?\n");
        System.out.println(set3);
        System.out.print("\nEnter N for No and Y for Yes: ");
        answer = input.nextLine();
        if (answer.equals("Y")){
            day = day + 4;
        }
        System.out.println("Is you birthday in Set 4?\n");
        System.out.println(set4);
        System.out.print("\nEnter N for No and Y for Yes: ");
        answer = input.nextLine();
        if (answer.equals("Y")){
            day = day + 8;
        }
        System.out.println("Is you birthday in Set 5\n");
        System.out.println(set5);
        System.out.print("\nEnter N for No and Y for Yes: ");
        answer = input.nextLine();
        if (answer.equals("Y")){
            day = day + 16;
        }
        System.out.println("\nYour birthday is on the " + day + "!");
    }
}
