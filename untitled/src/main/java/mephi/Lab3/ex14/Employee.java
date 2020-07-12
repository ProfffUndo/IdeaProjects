package mephi.Lab3.ex14;

public class Employee {
    private final String name;
    private final Double salary;

    public Employee(String name,Double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Double getSalary(){
        return salary;
    }
}
