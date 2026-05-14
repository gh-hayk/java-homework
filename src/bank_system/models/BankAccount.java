package bank_system.models;

import bank_system.enums.BankAccountType;
import bank_system.enums.Currency;

public class BankAccount extends Account{
    private BankAccountType bankAccountType;

    public BankAccount(String accountNumber, Currency currency, double balance, BankAccountType bankAccountType){
        super(accountNumber, currency, balance);
        this.bankAccountType = bankAccountType;
    }
    public BankAccountType getBankAccountType() {
        return bankAccountType;
    }
    public String toString() {
        return "BankAccount: " + accountNumber + " | Type: " + bankAccountType +
                " | Balance: " + balance + " " + currency;
    }
}
