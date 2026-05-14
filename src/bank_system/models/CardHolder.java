package bank_system.models;

import java.util.ArrayList;
import java.util.List;

public class CardHolder {
    private String passportNumber;
    private String fullName;
    private Address address;
    private List<CardAccount> cardList;
    private BankAccount bankAccount;

    public CardHolder(String passportNumber,String fullName,Address address){
    this.passportNumber = passportNumber;
    this.fullName =  fullName;
    this.address = address;
    this.cardList = new ArrayList<>();
    }
    public void addCard(CardAccount card){
        cardList.add(card);
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public Address getAddress() {
        return address;
    }

    public List<CardAccount> getCardList() {
        return cardList;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }
    public String toString() {
        return "CardHolder: " + fullName + " , Passport: " + passportNumber + ", Cards: " + cardList.size();
    }
}
