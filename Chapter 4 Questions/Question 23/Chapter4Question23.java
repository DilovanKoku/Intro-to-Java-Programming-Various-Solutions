import java.util.Scanner;

public class Chapter4Question23 {
    /*
(Financial application: payroll) Write a program that reads the following information and prints a payroll statement:
Employee’s name (e.g., Smith)
Number of hours worked in a week (e.g., 10) Hourly pay rate (e.g., 9.75)
Federal tax withholding rate (e.g., 20%) State tax withholding rate (e.g., 9%)
     */
    public static void main(String[] args) {
//        //Question 4.23 Financial application: payroll
        Scanner input = new Scanner(System.in);

        //prompt the user for information
        System.out.print("Enter employee's name: ");
        String employeeName = input.nextLine();

        System.out.print("Enter number of hours worked in a week: ");
        double hoursWorked = input.nextDouble();

        System.out.print("Enter hourly pay rate: ");
        double hourlyPay = input.nextDouble();

        System.out.print("Enter federal tax withholding rate: ");
        double federalTax = input.nextDouble() / 100.0;

        System.out.print("Enter state tax withholding rate: ");
        double stateTax = input.nextDouble() / 100.0;

        //Organize results
        double totalPay = (hourlyPay * hoursWorked);
        double totalFederal = (federalTax * totalPay);
        double totalState = (stateTax * totalPay);
        double totalDeduction = totalFederal + totalState;
        double netPay = (totalPay - totalDeduction);


        //Display results
        System.out.println("\nEmployee Name: " + employeeName);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Pay Rate $" + hourlyPay);
        System.out.println("Gross Pay $" + totalPay);
        System.out.printf("""
                Deduction:
                 Federal Withholding (20.0%%): $%1.2f
                 State Withholding (9.0%%): $%1.2f
                 Total Deduction: $%1.2f
                Net Pay: $%1.2f""",totalFederal,totalState,totalDeduction,netPay);
    }
}
