import java.util.Scanner;

public class Chapter2Question8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Prompt the user to enter time offset GMT
        System.out.println("Enter the time zone offset GMT: ");
        int offset = input.nextInt();

        //Total Millisecond since Epoch
        long milliSecondsSinceEpoch = System.currentTimeMillis();
        System.out.println(milliSecondsSinceEpoch);

        //Total Seconds since Epoch
        long totalSecondsSinceEpoch = milliSecondsSinceEpoch / 1000;
        System.out.println(totalSecondsSinceEpoch);

        //Get seconds passed since Epoch modulo 60
        long currentSecond = totalSecondsSinceEpoch % 60;
        System.out.println(currentSecond);

        //Get total minutes elapsed since epoch
        long totalMinutes = totalSecondsSinceEpoch / 60;
        System.out.println(totalMinutes);

        //Get the current minute
        long currentMinute = totalMinutes % 60;
        System.out.println(currentMinute);

        //Get the total hours
        long totalHours = totalMinutes / 60;
        System.out.println(totalHours);

        //Get current hour
        long currentHour = totalHours % 24;
        System.out.println(currentHour);
        currentHour = currentHour + offset;
        System.out.println(currentHour);

        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);





    }
}
