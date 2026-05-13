package enumeration_homework;

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
    public class Exercise1 {
        public static void main(String[] args) {

            Day today = Day.SATURDAY;

            // switch-ով ստուգում ենք՝ աշխատանքային օ՞ր է, թե՞ հանգստյան
            switch (today) {
                case SATURDAY:
                case SUNDAY:
                    System.out.println(today + " - Հանգստյան օր է");
                    break;
                default:
                    System.out.println(today + " - Աշխատանքային օր է");
            }
        }
    }