/*
Q3. Create a class named 'Member' having the following members:

Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class.
The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively.
Now, assign name, age, phone number, address and salary to an employee and a manager by making an object
of both of these classes and print the same.
*/

public class Member {
    String name;
    int age;
    String phNumber;
    String address;
    double salary;
    Member(String name, int age, String phNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phNumber = phNumber;
        this.address = address;
        this.salary = salary;
    }
    void printSalary() {
        System.out.println(salary);
    }
}

class Employee extends Member {
    String specialization;
    Employee(String n, int a, String p, String add, double s, String spec) {
        super(n, a, p, add, s);
        specialization = spec;
    }
}

class Manager extends Member {
    String department;
    Manager(String n, int a, String p, String add, double s, String dept) {
        super(n, a, p, add, s);
        department = dept;
    }

}

class memberMain {
    public static void main(String[] args) {
        Employee emp = new Employee("Ram", 32, "1111111111", "Mathura", 30000, "Artificial Intelligence");
        emp.printSalary();
        Manager man = new Manager("Raj", 31, "2222222222", "Mathura", 50000, "Quality Control");
        man.printSalary();
    }
}