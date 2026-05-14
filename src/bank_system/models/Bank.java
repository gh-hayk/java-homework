package bank_system.models;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String bankName;
    private Address address;
    private List<CardHolder> cardHolderList;

    public Bank(String bankName,Address address){
        this.bankName = bankName;
        this.address = address;
        this.cardHolderList = new ArrayList<>();
    }
    public void addCardHolder(CardHolder cardHolder){
        cardHolderList.add(cardHolder);
    }

    public String getBankName() {
        return bankName;
    }

    public Address getAddress() {
        return address;
    }
    public List<CardHolder> getCardHolderList() {
        return cardHolderList;
    }
    public String toString() {
        return "Bank: " + bankName + " , Address: " + address + " , Clients: " + cardHolderList.size();
    }
}
