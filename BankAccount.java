/*******************************************************************************
 * Kyle C. Tuczynski                                                           * 
 * Completed submission date: 12/02/14                                         *
 * This program is a bank account simulator. It consists of two classes.       *
 * The class names are Tuczynski_Bank and Tuczynski_TestBank.                  *
 * In this part the program will test the Tuczynski_Bank class.                *
 * Two classes are needed for the successful output of the program.            *
 * --------------------------------------------------------------------------- *
 *****      This class will contain the following fields and methods.      *****
 *****              ( Based on the following Requirements )                *****
 * --------------------------------------------------------------------------- *
 * The bank account should be uniquely identifiable.                           *
 * It shows whom the account belongs to.                                       *
 * The balance of the account should be stored, modifiable & accessible.       *
 * It allows you to see when the account was originally created                *
 * and when it was last accessed.                                              *
 * A bank account should store its monthly interest rate. -                    *
 * While remaining modifiable and accessible.                                  *
 * A bank account should be able to modify its balance based on the current    *
 * balance and the interest rate.                                              *  
 * Client can deposit and withdraw money from a bank account.                  *
 * --------------------------------------------------------------------------- *
 ******************************************************************************/

package lab8h_Bank;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.DecimalFormat;

public class BankAccount {
  
    private String id; //*** ID number for the account holder ***
    private String name; //*** The name of account holder ***
    private double balance; // *** The balance of the account ***
    private Date dateCreated; //*** date account was created  ***
    private Date dateAccessed; //*** date accessed on the account ***
    private double interestRate; //*** interest rate on the account ***
    private double deposit; //*** amount deposited to account ***
    private double withdraw; //*** amount withdrew from the account ***
    
    public BankAccount() {
    }
    //*** constructing the strings for the id and name on the account ***
    public BankAccount(String newID, String newName, double newBalance, 
            double newInterestRate, double newDeposit, double newWithdraw) {
        id = newID;
	name = newName;
        balance = newBalance;
        interestRate = newInterestRate; 
        deposit = newDeposit;
        withdraw = newWithdraw;
    }
    // *** Getting the individuals ID ***
    public String getID() {
        return id;
    }
    // *** Getting the individuals ID ***
    public String getName() {
        return name;
    }
    // *** Getting the balance of the account ***
    public double getBalance() {
        return balance;
    }
    // *** Getting the interest date of the account ***
    public double getInterestRate() {
        return interestRate;
    }
    // *** Getting the date the account was created ***
    public Date getDateCreated() {
	 dateCreated = new Date();
         return dateCreated;
    }
    // *** Getting the date the account was accessed ***
    public Date getDateAccessed() {
         return dateAccessed;
    }
    // *** Setting the ID ***
    public void setID(String id) {
        this.id = id;
        dateAccessed = new Date();
    }
    // *** Setting the ID ***
    public void setName(String name) {
        this.name = name;
        dateAccessed = new Date();
    }
     // *** Setting the balance ***
    public void setBalance(double balance) {
        this.balance = balance;
        dateAccessed = new Date();
    }    
     // *** Setting the withdraw ***
    public void setWithdraw(double withdraw) {
        this.balance = this.balance - withdraw;
        dateAccessed = new Date();
    }
     // *** Setting the deposit ***
    public void setDeposit(double deposit) {
        this.balance = this.balance + deposit;
        dateAccessed = new Date();
    }
    //*** Adding interest rate onto the account ***
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
  	double interestEarned = balance * ( interestRate / 12);
        balance += interestEarned;
        interestEarned = interestEarned / 100;
  }
    //*** overriding the default toString to the one that I defined ***
    @Override
	public String toString() {
            DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss.SSS");
            DecimalFormat round = new DecimalFormat("0.00");
        String result = "User ID: " + id + "\n" + "Name under the account: "
                + name + "\n" + "Account last accessed: " + dateFormat.format(getDateAccessed()) +
                "\n" + "Accound created on: " + dateFormat.format(getDateCreated()) 
                + "\n" + "Interest Rate: " + interestRate + "\n" 
                + "Final Balance: $" + round.format(getBalance());
        return result;
      
        } 
} //*** End of class Bank Account ***
