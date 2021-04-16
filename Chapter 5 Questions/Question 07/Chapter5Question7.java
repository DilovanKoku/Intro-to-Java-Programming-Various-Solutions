public class Chapter5Question7 {
    public static void main(String[] args) {
        /* Question 5.7
        (Financial application: compute future tuition) Suppose the tuition for a university is $10,000 this year and
        increases 5% every year. In one year, the tuition will be $10,500.
        Write a program that displays the tuition in 10 years,
        and the total cost of four years’ worth of tuition starting after the tenth year.
         */

        //We can solve this problem using a for loop

        //initialize placeholders
        double tuition = 10000;
        double fourYearCost = 0;
        double cost = 0;

        for (int i = 1; i <= 14; i++){
            tuition = tuition * 1.05;

            if (i == 10){
                cost = tuition;
            }
            if (i >= 14){
                fourYearCost = tuition;
            }
        }
        System.out.printf("The tuition after ten years is $%1.2f", cost);
        System.out.println();
        System.out.printf("The total costs of 4 years worth of tuition after the tenth year is $%1.2f",fourYearCost);
    }
}
