package bank_system;

import bank_system.appointments.Appointment;
import bank_system.appointments.AppointmentManager;
import bank_system.enums.*;
import bank_system.exceptions.BankTransactionException;
import bank_system.models.*;
import bank_system.transactions.BankAccountTransaction;
import bank_system.transactions.CardTransaction;

public class Main {
    public static void main(String[] args) {

        // ======= ADDRESS =======
        Address address = new Address("Armenia", "Yerevan", "Yerevan", "Abovyan", "10");
        System.out.println("Address: " + address);

        // ======= BANK =======
        Bank bank = new Bank("Ameriabank", address);

        // ======= CARD ACCOUNT =======
        CardAccount card = new CardAccount(
                "1234567890123456",
                "123",
                "12/27",
                CardType.VISA,
                Currency.AMD,
                500000.0
        );

        // ======= BANK ACCOUNT =======
        BankAccount debitAccount = new BankAccount(
                "9876543210123456",
                Currency.USD,
                1000.0,
                BankAccountType.DEBIT
        );

        BankAccount creditAccount = new BankAccount(
                "1111222233334444",
                Currency.USD,
                0.0,
                BankAccountType.CREDIT
        );

        // ======= CARDHOLDER =======
        CardHolder holder = new CardHolder("AB123456", "Aram Petrosyan", address);
        holder.addCard(card);
        holder.setBankAccount(debitAccount);

        // ======= BANK =======
        bank.addCardHolder(holder);
        System.out.println(bank);

        // ======= CARD TRANSACTIONS =======
        System.out.println("\n=== Card Transactions ===");
        CardTransaction cardTransaction = new CardTransaction(card);
        try {
            cardTransaction.deposit(100000);
            cardTransaction.withdraw(50000);
            cardTransaction.blockCard();
            cardTransaction.deposit(10000);
        } catch (BankTransactionException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // ======= BANK ACCOUNT TRANSACTIONS =======
        System.out.println("\n=== Bank Account Transactions ===");
        BankAccountTransaction bankTransaction = new BankAccountTransaction(debitAccount);
        try {
            bankTransaction.deposit(500);
            bankTransaction.transfer(200, creditAccount);
            bankTransaction.withdraw(100);
        } catch (BankTransactionException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // ======= APPOINTMENTS =======
        System.out.println("\n=== Appointments ===");
        AppointmentManager manager = new AppointmentManager();

        manager.scheduleAppointment(new Appointment("Ani Grigoryan", ServiceType.CARD_ISSUE, "10:00", 2));
        manager.scheduleAppointment(new Appointment("Davit Harutyunyan", ServiceType.LOAN_CONSULTATION, "11:00", 1));
        manager.scheduleAppointment(new Appointment("Mariam Sargsyan", ServiceType.ACCOUNT_OPENING, "12:00", 3));

        manager.printAllAppointments();

        System.out.println("\nNext appointment: " + manager.getNextAppointment());
    }
}
