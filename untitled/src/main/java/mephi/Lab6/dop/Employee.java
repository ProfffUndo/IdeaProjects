package mephi.Lab6.dop;

public class Employee extends Person {
    private double salary;

    public Employee(String name, double salary) {
        super(name);
        this.salary=salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                "} " + super.toString();
    }
}
