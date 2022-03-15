package csc1009.src.lect08;

public class CheckingAccount {

    private double balance;
    private int number;

    public double getBalance() {
        return this.balance;
    }

    public int getNumber() {
        return this.number;
    }
 
    public void withdraw(double amount) throws InSufficientFundException {
        if (amount > balance) throw new InSufficientFundException(String.format("Sorry, but your current account is short by $%.2f.", amount-balance));
        
        balance -= amount;
        System.out.printf("The balance after withdraw is: $%.2f.", balance);
    }
 
    public void deposit(double amount) {
        //over here I could throw in IllegalArgument if user inputs less than 0.
        balance +=amount;
    }
}