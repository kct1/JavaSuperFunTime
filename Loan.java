//Loan class this program creates a loan calculator 

package newpackage;
public class Loan {
  private double annualInterest;
  private int numOfYears;
  private double loanAmount;
  private java.util.Date loanDate;

  public Loan() {
    this(6.5, 12, 20000);
  }

  public Loan(double annualInterest, int numOfYears,
      double loanAmount) {
    this.annualInterest = annualInterest;
    this.numOfYears = numOfYears;
    this.loanAmount = loanAmount;
    loanDate = new java.util.Date();
  }

  public double getAnnualInterest() {
    return annualInterest;
  }

  public void setAnnualInterest(double annualInterest) {
    this.annualInterest = annualInterest;
  }

  public int getNumOfYears() {
    return numOfYears;
  }

  public void setNumOfYears(int numOfYears) {
    this.numOfYears = numOfYears;
  }

  public double getLoanAmount() {
    return loanAmount;
  }

  public void setLoanAmount(double loanAmount) {
    this.loanAmount = loanAmount;
  }

  public double getMonthlyPayment() {
    double monthlyInterest = annualInterest / 1200;
    double monthlyPayment = loanAmount * monthlyInterest / (1 -
      (Math.pow(1 / (1 + monthlyInterest), numOfYears * 12)));
    return monthlyPayment;    
  }

  public double getTotalPayment() {
    double totalPayment = getMonthlyPayment() * numOfYears * 12;
    return totalPayment;    
  }

  public java.util.Date getLoanDate() {
    return loanDate;
  }
} //end of clas loan
