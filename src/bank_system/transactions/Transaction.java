package bank_system.transactions;

import bank_system.exceptions.BankTransactionException;

public interface Transaction {
    void deposit(double amount) throws BankTransactionException;
    void withdraw(double amount) throws BankTransactionException;
    void transfer(double amount, Object targetAccount) throws BankTransactionException;

}
