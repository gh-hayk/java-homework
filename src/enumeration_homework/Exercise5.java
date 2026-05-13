package enumeration_homework;

public enum Exercise5 {

    USD("$", "United States Dollar"),
    EUR("€", "Euro"),
    JPY("¥", "Japanese Yen");

    private String symbol;
    private String fullName;

    Exercise5(String symbol, String fullName) {
        this.symbol = symbol;
        this.fullName = fullName;
    }

    // toString() override - System.out.println-ը ինքնաբերաբար կկանչի սա
    @Override
    public String toString() {
        return this.name() + " " + symbol + " - " + fullName;
    }

    public static void main(String[] args) {
        for (Exercise5 currency : Exercise5.values()) {
            System.out.println(currency);
        }
    }
}

