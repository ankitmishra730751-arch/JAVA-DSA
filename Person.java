public class Person {
    int id;
    String name;
    String address;

    Person(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}

class PermanentEmployee extends Person {
    double salary;

    PermanentEmployee(int id, String name, String address, double salary) {
        super(id, name, address);
        this.salary = salary;
    }

    void printDetails() {
        super.printDetails();
        System.out.println("Salary: " + salary);
    }
}


class ContractualEmployee extends Person {
    int workingHours;
    double ratePerHour;

    ContractualEmployee(int id, String name, String address, int workingHours, double ratePerHour) {
        super(id, name, address);
        this.workingHours = workingHours;
        this.ratePerHour = ratePerHour;
    }

    void printDetails() {
        super.printDetails();
        System.out.println("Working Hours: " + workingHours);
        System.out.println("Rate Per Hour: " + ratePerHour);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {

        PermanentEmployee pe =
                new PermanentEmployee(101, "Ankit", "Delhi", 50000);

        ContractualEmployee ce =
                new ContractualEmployee(102, "Rahul", "Noida", 8, 500);

        System.out.println("Permanent Employee Details:");
        pe.printDetails();

        System.out.println("\nContractual Employee Details:");
        ce.printDetails();
    }
}
    

