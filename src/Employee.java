public class Employee {
    private int id;
    private int departmentNumber;
    private int age;
    private char gender;

    public Employee(int id, int departmentNumber, int age, char gender) {
        this.id = id;
        this.departmentNumber = departmentNumber;
        this.age = age;
        this.gender = gender;
    }
    void printEmploye() {
        System.out.println("---Employee Information---");
        System.out.println("ID: " + id);
        System.out.println("Department Number: " + departmentNumber);
        System.out.println("Age: " + age);

        if (gender == 'M') {
            System.out.println("Gender: Male");
        } else if (gender == 'F') {
            System.out.println("Gender: Female");
        } else {
            System.out.println("Gender: " + gender);
        }
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(1,20,21, 'm');
        Employee emp2 = new Employee(2,21,27,'m');
        Employee emp3 = new Employee(3,20,21,'f');

        emp1.printEmploye();
        emp2.printEmploye();
        emp3.printEmploye();

    }
}
