class Employee {

    private String name;

    private int yearOfJoining;

    private String address;

    public Employee(String name, int yearOfJoining, String address) {

        this.name = name;

        this.yearOfJoining = yearOfJoining;

        this.address = address;

    }

    public void printEmployeeInfo() {

        System.out.printf("%-10s %-20s %s\n", name, yearOfJoining, address);

    }

}

public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Robert", 1994, "64C- WallsStreet");

        Employee employee2 = new Employee("Sam", 2000, "68D- WallsStreet");

        Employee employee3 = new Employee("John", 1999, "26B- WallsStreet");

        System.out.println("Name       Year of joining     Address");

        System.out.println("------------------------------------");

        employee1.printEmployeeInfo();

        employee2.printEmployeeInfo();

        employee3.printEmployeeInfo();

    }

}
