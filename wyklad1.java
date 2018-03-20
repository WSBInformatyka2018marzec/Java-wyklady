import java.util.Scanner;

public class Wyklad1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.print("Podaj imie: ");
            String name = userInput.nextLine();
            System.out.print("Podaj zarobki: ");
            int salary = userInput.nextInt();
            Employee janusz = new Employee(name, salary);
            janusz.sayHello();
            System.out.print("Miesięcznie zarabiam: ");
            janusz.monthlySalary();
            System.out.print("A moją pozycją jest: ");
            System.out.println(janusz.type);
            String blank = userInput.nextLine();
            //janusz.setSick();
            //boolean isSick = janusz.isSick();
        }
        userInput.close();
    }
}

class Employee {
    String name;
    int yearlySalary;
    boolean sick;
    String type;

    public Employee() { // default constructor
        name = "Unknown";
        yearlySalary = 0;
        type = "nobody";
    }


    public Employee(String name, int salary) {
        this.name = name; // przypisuje wartość name do stringa z employee
        this.yearlySalary = salary;

        if (salary > 1000000 && ("Janusz".equals(name) || "janusz".equals(name))){
            type = "CEO";
        } else if (salary > 750000) {
            type = "dyrektor";
        } else {
            type = "programista";
        }
    }

    void sayHello() {
        String msg = String.format("Hej, jestem %s i zarabiam %d.", name, yearlySalary);
        System.out.println(msg);
    }

    boolean isSick() {
        return sick;
    }

    void setSick() {
        this.sick = true;
    }

    void monthlySalary() {
        double monthlySalary = yearlySalary/12.0;
        String msg = String.format("%.2f", monthlySalary); // %.2f - dwa miejsca po przecinku
        System.out.println(msg);
    }
}
