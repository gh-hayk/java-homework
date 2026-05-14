package bank_system.enums;

public enum Currency {
    AMD(0.10),
    USD(0.05),
    RUB(0.15);

    private final double interestRate;

    Currency(double interestRate){
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }
}
