package bank_system.transactions;

import bank_system.exceptions.BankTransactionException;
import bank_system.exceptions.InsufficientFundsException;
import bank_system.enums.CardStatus;
import bank_system.models.CardAccount;

public class CardTransaction implements Transaction {
    private CardAccount card;

    public CardTransaction(CardAccount card) {
        this.card = card;
    }

    @Override
    public void deposit(double amount) throws BankTransactionException {
        if (card.getCardStatus() == CardStatus.BLOCKED) {
            throw new BankTransactionException("Cannot deposit! Card is blocked.");
        }
        card.setBalance(card.getBalance() + amount);
        System.out.println("Deposited: " + amount + " | New balance: " + card.getBalance());
    }
    @Override
    public void withdraw(double amount) throws BankTransactionException {
        if (card.getCardStatus() == CardStatus.BLOCKED){
            throw new BankTransactionException("Cannot deposit! Card is blocked");
        }
        if (card.getBalance() < amount){
            throw new InsufficientFundsException(amount, card.getBalance());
        }
        card.setBalance(card.getBalance() - amount);
        System.out.println("Withdraw " + amount + ", New balance " + card.getBalance());
    }
    @Override
    public void transfer(double amount, Object targetAccount) throws BankTransactionException {
        if (card.getCardStatus() == CardStatus.BLOCKED) {
            throw new BankTransactionException("Cannot transfer! Card is blocked.");
        }
        if (card.getBalance() < amount) {
            throw new InsufficientFundsException(amount, card.getBalance());
        }
        CardAccount target = (CardAccount) targetAccount;
        card.setBalance(card.getBalance() - amount);
        target.setBalance(target.getBalance() + amount);
        System.out.println("Transferred: " + amount + " to " + target.getAccountNumber());
    }

    public void blockCard() {
        card.setCardStatus(CardStatus.BLOCKED);
        System.out.println("Card " + card.getAccountNumber() + " is now BLOCKED.");
    }
}