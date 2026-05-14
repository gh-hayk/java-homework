package bank_system.models;

import bank_system.enums.CardStatus;
import bank_system.enums.CardType;
import bank_system.enums.Currency;

public class CardAccount extends Account{
    private String cvv;          // 3 նիշ
    private String expirationDate;
    private CardType cardType;
    private CardStatus cardStatus;
    public CardAccount(String accountNumber, String cvv, String expirationDate,
                       CardType cardType, Currency currency, double balance){
     super(accountNumber, currency, balance);
     if (cvv.length() != 3){
         throw new IllegalArgumentException("CVV must be 3 digits");
     }
     this.cvv = cvv;
     this.expirationDate = expirationDate;
     this.cardType = cardType;
     this.cardStatus = cardStatus.ACTIVE;
    }

    public String getCvv(){
        return cvv;
    }
    public String getExpirationDate(){
        return expirationDate;
    }
    public CardType getCardType(){
        return cardType;
    }
    public CardStatus getCardStatus(){
        return cardStatus;
    }
    public void setCardStatus(CardStatus cardStatus){
        this.cardStatus = cardStatus;
    }

    public String toString() {
        return "CardAccount: " + accountNumber + " , Type: " + cardType + " , Status: " + cardStatus + " , Balance: " + balance + " " + currency;
    }
}
