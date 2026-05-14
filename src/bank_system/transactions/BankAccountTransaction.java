package bank_system.transactions;

import bank_system.enums.BankAccountType;
import bank_system.exceptions.BankTransactionException;
import bank_system.exceptions.InsufficientFundsException;
import bank_system.models.BankAccount;

public class BankAccountTransaction implements Transaction {
    private BankAccount account;

    public BankAccountTransaction(BankAccount account){
        this.account = account;
    }

    @Override
    public void deposit(double amount) throws BankTransactionException{
        if (account.getBankAccountType() != BankAccountType.DEBIT){
            throw new BankTransactionException("Cannot deposit! Only DEBIT accounts can receive money");
        }
        account.setBalance(account.getBalance() + amount);
        System.out.println("Deposit " + amount + ", New balance " + account.getBalance());
    }
    @Override
    public void withdraw(double amount) throws BankTransactionException{
        if (account.getBankAccountType() != BankAccountType.CREDIT){
            throw new BankTransactionException("Cannot deposit! Only DEBIT accounts can receive money");
        }
        if (account.getBalance() < amount){
            throw new InsufficientFundsException(amount, account.getBalance());
        }
        account.setBalance(account.getBalance() - amount);
        System.out.println("Withdrawn: " + amount + " | New balance: " + account.getBalance());
    }
    @Override
    public void transfer(double amount, Object targetAccount) throws BankTransactionException{
        if (account.getBankAccountType() != BankAccountType.DEBIT){
            throw new BankTransactionException("Transfer must go FROM a DEBIT account.");
        }
        BankAccount target = (BankAccount) targetAccount;
        if (target.getBankAccountType() != BankAccountType.CREDIT){
            throw new BankTransactionException("Transfer must go FROM a DEBIT account.");
        }
        if (account.getBalance() < amount){
            throw new InsufficientFundsException(amount, account.getBalance());
        }
        account.setBalance(account.getBalance() - amount);
        target.setBalance(target.getBalance() + amount);
        System.out.println("Transferred: " + amount + " | From: " + account.getAccountNumber() + " | To: " + target.getAccountNumber());
    }
}