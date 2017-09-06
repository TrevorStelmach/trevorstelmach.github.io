// This program calculates the monthly payment on a car loan based on the loan amount, loan length, interest rate, and down payment.
public class CarLoan {
	public static void main(String[] args) {
    int carLoan = 10000;
    int loanLength = 3;
    int interestRate = 5;
    int downPayment = 2000;
    
    if (loanLength <= 0 || interestRate <= 0){
      System.out.println("Loan length and interest rate must be greater than 0.");
    }
    else if(downPayment >= carLoan){
      System.out.println("The car can be paid in full");
    }
    else {
      int remainingBalance = carLoan - downPayment;
      int months = loanLength * 12;
      int monthlyBalance = remainingBalance / months;
      int interest = (interestRate * monthlyBalance) / 100;
int monthlyPayment = monthlyBalance + interest;
      System.out.println(monthlyPayment);
    }
  }
}