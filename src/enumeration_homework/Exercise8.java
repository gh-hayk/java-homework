package enumeration_homework;

public enum Exercise8 {

    FREE(0),
    BASIC(9.99),
    PREMIUM(19.99),
    ENTERPRISE(49.99);

    private double monthlyCost;

    Exercise8(double monthlyCost) {
        this.monthlyCost = monthlyCost;
    }

    public double getMonthlyCost() { return monthlyCost; }

    public static void compareAndPrint(Exercise8 plan1, Exercise8 plan2) {
        // compareTo-ն ավելի մեծ ordinal ունեցողի համար վերադարձնում է դրական թիվ
        if (plan1.compareTo(plan2) > 0) {
            System.out.println(plan1 + " -ը ավելի բարձր է, քան " + plan2);
        } else if (plan1.compareTo(plan2) < 0) {
            System.out.println(plan2 + " -ը ավելի բարձր է, քան " + plan1);
        } else {
            System.out.println("Երկու պլաններն հավասար են");
        }
    }

    public static void printBenefits(Exercise8 plan) {
        switch (plan) {
            case FREE:
                System.out.println("FREE - Անվճար հիմնական հասանելիություն");
                break;
            case BASIC:
                System.out.println("BASIC ($" + BASIC.getMonthlyCost() + "/ամիս) - Ընդլայնված հնարավորություններ");
                break;
            case PREMIUM:
                System.out.println("PREMIUM ($" + PREMIUM.getMonthlyCost() + "/ամիս) - Բոլոր հնարավորությունները");
                break;
            case ENTERPRISE:
                System.out.println("ENTERPRISE ($" + ENTERPRISE.getMonthlyCost() + "/ամիս) - Անսահмантial + աջակցություն");
                break;
        }
    }

    public static void main(String[] args) {
        compareAndPrint(PREMIUM, BASIC);

        System.out.println();

        for (Exercise8 plan : Exercise8.values()) {
            printBenefits(plan);
        }
    }
}

