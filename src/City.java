public class City {
    public static void main(String[] args) {
        City yerevan = new City('Y', 1075000);
        City moscow = new City('M', 12500000);
        City newYork = new City('N', 8419000);
        City paris = new City('P', 2148000);

        System.out.println("Moscow population: " + moscow.getPopulation());
        System.out.println("Paris population: " + paris.getPopulation());
        System.out.println("New York population: " + newYork.getPopulation());
        System.out.println("Yerevan population: " + yerevan.getPopulation());

            }


    private char code;
    private int population;

    public City(char code, int population){
        this.code = code;
        this.population = population;
    }
    public char getCode(){
        return code;
    }
    public int getPopulation(){
        return population;
    }

}
