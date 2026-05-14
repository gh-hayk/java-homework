package bank_system.exceptions;

public class InsufficientFundsException extends BankTransactionException {
    public InsufficientFundsException(double amount, double balance) {
        super("Not enough funds! Tried: " + amount + ", Available: " + balance);
    }
}