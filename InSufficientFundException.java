package csc1009.src.lect08;

public class InSufficientFundException extends Exception {
    //Exception is checked; checked at compiled time
    //Runtime Exception is unchecked; exempted from checking at compile time.
    private double amount;

    public InSufficientFundException(double amount){
        this.amount = amount;
    }

    public double getAmount(){
        return amount;
    }

    public InSufficientFundException (String message){
        super(message);
    }
}