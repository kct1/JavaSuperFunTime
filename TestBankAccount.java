/******************************************************************************* 
 * Kyle C. Tuczynski                                                           *
 * Completed submission date: 12/02/14                                         *
 * This program is a bank account simulator. It consists of two classes.       *
 * The class names are Tuczynski_Bank and Tuczynski_TestBank.                  *
 * In this part the program will test the Tuczynski_TestBank class.            *
 * Two classes are needed for the successful output of the program.            *
 * --------------------------------------------------------------------------- *
 *****      This class will contain the following fields and methods.      *****
 * --------------------------------------------------------------------------- *
 * It initializes objects of the Tuczynski_Bank class with the value.          *
 * It calls various methods.                                                   * 
 * Finally, it prints out the resulting values.                                *
 * --------------------------------------------------------------------------- *
 ******************************************************************************/

package lab8h_Bank;

import java.util.Scanner;

public class TestBankAccount {
    
    public static void main(String[] args) {
       //***Print Statement for a lovely header***
       System.out.println("$====================================$");
       System.out.println("Welcome to Tuczynski Conglomerate Bank");
       System.out.println("$====================================$");
       //*** Scanner used for user input in Bank Account ***
       Scanner input = new Scanner(System.in);
       
       //*** prompting user to enter the bank account id # ***
       System.out.println("Please enter your ID number (ex. 1149): ");
       //*** variable id ***
       String id = input.nextLine();
       
       //*** prompting the user to enter the name under the account ***
       System.out.println("Please enter the name on the account(ex. Mike Smith): ");
       //*** variable name ***
       String name = input.nextLine();
       
       //*** prompting the user to enter their balance on the account ***
       System.out.println("Please enter the balance of the Account(ex. 200.00): ");
       //*** variable name ***
       double balance = input.nextDouble();
       
         //*** prompting the user to enter the interest rate on the account ***
       System.out.println("Please enter your interest rate (ex. 0.05): ");
       //*** variable name ***
       double interestRate = input.nextDouble();
       
        //*** prompting the user to enter deposit amount ***
        System.out.println("Enter the amount you would like to deposit (ex 0.00) ");
        //*** variable name ***
        double deposit  = input.nextDouble();
       
        //*** prompting the user to enter the amount to withdraw ***
        System.out.println("Enter the amount you would like to withdraw (ex 20.00): ");
        //*** variable name ***
        double withdraw = input.nextDouble();
       
    //******* Account #1 *********      
      BankAccount account1 = new BankAccount();
      account1.setID(id);
      account1.setName(name);
      account1.setBalance(balance);
      account1.setInterestRate(interestRate);
      account1.setDeposit(deposit);
      account1.setWithdraw(withdraw);
      
      //***********Display the Bank Account Information
      //***Print Statement for a lovely header***
       System.out.println("$====================================$");
       System.out.println("Welcome to Tuczynski Conglomerate Bank");
       System.out.println("$====================================$");
       System.out.println(account1);
       System.out.println("$====================================$");
       System.out.println("   Thank you for banking with us...");
    } // ***** End of Void main *****
} // ***** End of class Tuczynski_TestBank *****
