//This program is a loan calculator 

package newpackage;
import java.util.Scanner;

public class TestLoan {
  
  public static void main(String[] args) {
    // Create a Scanner for user input
    Scanner input = new Scanner(System.in);

    // Prompt to enter annual interest rate
    System.out.print(
      "Enter yearly interest rate, for example, 6.75: ");
    double annualInterest = input.nextDouble();

    // prompt to enter term length
    System.out.print("Enter number of years (ex. 12): ");
    int numOfYears = input.nextInt();

    // prompt to enter loan amount
    System.out.print("Enter loan amount (ex. 220500.50): ");
    double loanAmount =  input.nextDouble();

    // Creating the Loan object
    Loan loan = new Loan(annualInterest, numOfYears, loanAmount);

    // Display loan date, monthly payment, and total payment
    System.out.printf("Your loan creation date: %s\n" +
      "Monthly Payment: %.2f\n Total Loan Amount: %.2f\n",
      loan.getLoanDate().toString(), loan.getMonthlyPayment(), 
      loan.getTotalPayment());
  } //end of main
} //end of Test Loan
