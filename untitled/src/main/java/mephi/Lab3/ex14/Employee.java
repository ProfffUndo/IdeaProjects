package mephi.Lab3.ex14;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name,double salary){
        this.name = name;
        this.salary = salary;
    }

    public Employee(){
        this.name="";
        this.salary=0d;
    }

    public String getName() {
        return name;
    }

    public Double getSalary(){
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
