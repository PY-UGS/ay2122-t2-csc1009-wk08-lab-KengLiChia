package csc1009.src.lect08;

import java.util.Scanner;

public class BankDemoTest {
    public static void main(String[] args) throws InSufficientFundException {
        
        CheckingAccount acct = new CheckingAccount();
    
        Scanner input = new Scanner(System.in);
        System.out.print("Enter deposit amount: ");
        double depositAmount= input.nextDouble();

        acct.deposit(depositAmount);

        System.out.print("Enter withdrawal amount: ");
        double withdrawalAmount= input.nextDouble();

        acct.withdraw(withdrawalAmount);

        input.close();

    }
    
}
